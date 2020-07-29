package com.vkeonline.enthuware.exam816;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * @author csgear
 */
public class StreamFeatures {

    public static double computeAverage() {
        var nums = List.of(1, 2, 3, 4).stream();
        double average = nums.parallel().mapToDouble(i -> i).average().getAsDouble();
        System.out.println(average);
        var nums2 = List.of(1, 2, 3, 4).stream();
        average = nums2.collect(Collectors.averagingInt(i -> i));
        System.out.println(average);
        return average;
    }

    public static void getMax() {
        List<Integer> ls = List.of(3, 4, 6, 9, 2, 5, 7);
        System.out.println(ls.stream().reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b));
        System.out.println(ls.stream().max(Integer::compare).get());
        System.out.println(ls.stream().max(Integer::max).get());
        System.out.println(ls.stream().max((a, b) -> a > b ? a : b).get());
    }

    public void checkIntStream() {
        Stream<Integer> si = Stream.iterate(1, x -> x++);
        Optional o = si.filter(x -> x < 5).limit(3).max((x, y) -> x - y);
        System.out.println(o.get());
    }

    public void getTenRandomDoubles() {
        new Random().doubles(10).forEach(System.out::print);
        Random r = new Random();
        DoubleStream.generate(() -> r.nextDouble()).limit(10).forEach(System.out::print);
        DoubleStream rStream = r.doubles().limit(10);
        rStream.forEach(System.out::print);
    }

    public void checkJoining() {
        class Course {
            private String id;
            private String name;

            public Course(String id, String name) {
                this.id = id;
                this.name = name;
            }

            public String getId() {
                return id;
            }

            public String getName() {
                return name;
            }
        }

        List<Course> cList = Arrays.asList(
                new Course("803", "OCAJP 7"),
                new Course("808", "OCAJP 8"),
                new Course("809", "OCPJP 8")
        );

        var result = cList.stream().filter(c -> c.getName().indexOf("8") > -1)
                .map(c -> c.getId())
                .collect(Collectors.joining("1Z0-"));
        System.out.println(result);
    }

    static void groupOnStream() {
        List<String> names = Arrays.asList("greg", "dave", "don", "ed", "fred");
        Map<Integer, Long> data = names.stream().collect(Collectors.groupingBy(
                String::length,
                Collectors.counting()));
        System.out.println(data.values());
    }

    static void flatMapOutput() {
        List<Integer> l1 = List.of(1, 2, 3);
        List<Integer> l2 = List.of(4, 5, 6);
        List<Integer> l3 = List.of();

        Stream.of(l1, l2, l3).flatMap(x -> x.stream()).map(x -> x + 1).forEach(System.out::println);
    }

    static void filterWithOptional() {
        var stream = LongStream.of(1, 2, 3);
        var opt = stream.map(n -> n * 10).filter(n -> n < 5).findFirst();
        if (opt.isPresent()) {
            System.out.println(opt.getAsLong());
        }
    }

    static void streamIterate() {
        var stream = Stream.iterate("", (s) -> s + "1");
        System.out.println(stream.limit(2).map(x -> x + "2").collect(Collectors.joining(",")));
    }

    static void matchOperators1() {
        Predicate<String> predicate = s -> s.startsWith("g");
        var stream1 = Stream.generate(() -> "growl!");
        var stream2 = Stream.generate(() -> "growl!");
        var b1 = stream1.anyMatch(predicate);
        var b2 = stream2.allMatch(predicate);
        System.out.println(b1 + " " + b2);
    }

    static void primitiveStream() {
        double result = LongStream.of(6L, 8L, 10L).
                mapToInt(x -> (int) x).
                boxed().
                collect(Collectors.groupingBy(x -> x)).
                keySet().
                stream().
                collect(Collectors.averagingInt(x -> x));

        System.out.println("result = " + result);
    }

    static void matchOperators2() {
        Predicate<String> predicate = s -> s.length() > 3;
        var stream = Stream.iterate("-", s -> !s.isEmpty(), s -> s + s);
        var b1 = stream.noneMatch(predicate);
        var b2 = stream.anyMatch(predicate);
        System.out.println(b1 + " " + b2);
    }


    public static void main(String[] args) {

        List<String> vals = Arrays.asList("a", "b");
        String join = vals.parallelStream()
                .reduce("_",
                        (a, b)->a.concat(b)
                );
        System.out.println(join);

    }


}

class Person {
    private String name;

    public int getAge() {
        return age;
    }

    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        List<Person> friends = Arrays.asList(
                new Person("Bob", 31),
                new Person("Paul", 32),
                new Person("John", 33));
        double averageAge = friends.stream().filter(f -> f.getAge() < 30).mapToInt(f -> f.getAge()).average().getAsDouble();
        System.out.println(averageAge);
    }
}