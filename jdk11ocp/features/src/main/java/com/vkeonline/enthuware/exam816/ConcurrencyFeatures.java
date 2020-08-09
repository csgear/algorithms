package com.vkeonline.enthuware.exam816;

import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

/**
 * @author csgear
 */
public class ConcurrencyFeatures {
    public static void main(String[] args) {
        atomicOpers();
        var data = List.of(2, 5, 1, 9, 8);
        data.stream().parallel().mapToInt(s -> s).peek(System.out::println).forEachOrdered(System.out::println);
        System.out.println(noResult());
    }

    private static int noResult() {
        return -1 ;
    }
    
    private static void atomicOpers() {
        var value1 = new AtomicInteger(0);
        final long[] value2 = {0};
        IntStream.iterate(1, i -> 1).limit(100).parallel().forEach(i -> value1.incrementAndGet());
        IntStream.iterate(1, i -> 1).limit(100).parallel().forEach(i -> ++value2[0]);
        System.out.println(value1 + " " + value2[0]);
    }

    private static int doWork(int input) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        return input;
    }


    private static void paralleOperations() {
        long start = System.currentTimeMillis();
        List.of(1, 2, 3, 4, 5).parallelStream().map(w -> doWork(w)).forEach(x -> System.out.print(x + " "));
        System.out.println();
        var timeTaken = (System.currentTimeMillis() - start) / 1000;
        System.out.println("Time: " + timeTaken + " seconds");
    }

    private static void sumbitTasksToServices() {
        ExecutorService service1 = null;
        Runnable taks1 = () -> System.out.println("Printing zoo inventory");
        Runnable task2 = () -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Printing record: " + i);
            }
        };

        try {
            service1 = Executors.newScheduledThreadPool(2);
            System.out.println("Begin");
            service1.execute(taks1);
            service1.execute(task2);
            service1.execute(taks1);
            Future<?> future = service1.submit(() -> {
                System.out.println("Hello future!");
            });
            future.get(10, TimeUnit.SECONDS);
            System.out.println("End");
        } catch (InterruptedException | TimeoutException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            if (service1 != null) {
                service1.shutdown();
            }
        }

        ScheduledExecutorService service2 = null;

        Runnable task3 = () -> System.out.println("Hello Zoo");
        Callable<String> task4 = () -> "Monkey";

        try {
            service2 = Executors.newSingleThreadScheduledExecutor();
            ScheduledFuture<?> r1 = service2.schedule(task3, 10, TimeUnit.SECONDS);
        } finally {
            if (service2 != null) {
                service2.shutdown();
            }
        }

        ExecutorService service3 = null;

        Callable<String> task5 = () -> "batch tasks";

        try {
            service3 = Executors.newFixedThreadPool(4);
            List<Future<String>> listOfTasks = service3.invokeAll(List.of(task5, task5, task5));
            for (var result : listOfTasks) {
                System.out.println(result.get());
            }
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (service3 != null) {
                service3.shutdown();
            }
        }
    }

    class Bank {
        private Lock vault = new ReentrantLock();
        private int total = 0;

        public void deposit(int value) {
            try {
                vault.tryLock();
                total += value;
            } finally {
                vault.unlock();
            }
        }

    }

    private void checkDeposit() {
        var bank = new Bank();
        IntStream.range(1, 10).parallel().forEach(s -> bank.deposit(s));

        System.out.println(bank.total);
    }
}
