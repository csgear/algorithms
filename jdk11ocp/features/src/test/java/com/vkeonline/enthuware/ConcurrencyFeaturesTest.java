package com.vkeonline.enthuware;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.concurrent.*;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class ConcurrencyFeaturesTest {

    /**
     * helper function
     * @param cb
     */
    static void await(CyclicBarrier cb) {
        try {
            cb.await() ;
        }
        catch (InterruptedException | BrokenBarrierException e) {

        }
    }

    @Test
    @DisplayName("Test CyclicBarrier, it shall print Clean four times")
    public void testTaskWithCyclicBarrier() {
        final CyclicBarrier cb = new CyclicBarrier(3, () -> {
            System.out.println("Clean");
        }) ;
        ExecutorService executors = Executors.newScheduledThreadPool(4) ;
        IntStream.iterate(1, i -> 1).limit(12).forEach(i-> executors.submit(() -> await(cb)));
     }

    @Test
    @DisplayName("First Executor Service")
    public void firstExecutorService() {
        Runnable hellos = () -> {
            for(int i = 0 ; i < 1000 ; i++) {
                System.out.println("Hello " + i );
            }
        } ;

        Runnable goodbyes = () -> {
            for(int i = 0 ; i < 1000 ; i++) {
                System.out.println("Goodbye " + i);
            }
        } ;

        ExecutorService executor = Executors.newCachedThreadPool() ;
        executor.execute(hellos);
        executor.execute(goodbyes);
    }

    @Test
    @DisplayName("Test concurrency data structure")
    public void testConcurrencyDataStructure() {
        List<Integer> source = Arrays.asList(1,2,3,4) ;
        List<Integer> fish = new CopyOnWriteArrayList<>(source) ;
        List<Integer> mammals = Collections.synchronizedList(source) ;
        Set<Integer> birds = new ConcurrentSkipListSet<>() ;
        birds.addAll(source) ;

        synchronized (Integer.valueOf(1)) {
            for(Integer f: fish) fish.add(4) ;
            // unsupported operation exception
            for(Integer m: mammals) mammals.add(5) ;
            for(Integer b: birds ) birds.add(5) ;
            System.out.println(fish.size() + " " + birds.size());
        }

     }

}