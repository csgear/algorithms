package com.vkeonline.enthuware;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;



public class StreamFeatures {
    public double computeAverage() {
        var nums = List.of(1,2,3,4).stream();
        double average = nums.parallel().mapToDouble(i->i).average().getAsDouble() ;
        System.out.println(average);
        var nums2 = List.of(1,2,3,4).stream() ;
        average = nums2.collect(Collectors.averagingInt(i->i)) ;
        System.out.println(average);
        return average ;
    }

    public void getMax() {
        List<Integer> ls = List.of(3,4,6,9,2,5,7) ;
        System.out.println(ls.stream().reduce(Integer.MIN_VALUE, (a,b)->a>b? a : b)) ;
        System.out.println(ls.stream().max(Integer::compare).get());
        System.out.println(ls.stream().max(Integer::max).get());
        System.out.println(ls.stream().max( (a,b) -> a > b? a : b).get()) ;
    }

    public void getTenRandomDoubles() {
        new Random().doubles(10).forEach(System.out::print);
        Random r = new Random() ;
        DoubleStream.generate(() -> r.nextDouble()).limit(10).forEach(System.out::print);
        DoubleStream rStream = r.doubles().limit(10) ;
        rStream.forEach(System.out::print);
    }

    public void checkJoining() {
        class Course {
            private String id ;
            private String name ;

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
        ) ;

        var result = cList.stream().filter(c->c.getName().indexOf("8") > -1)
                .map(c->c.getId())
                .collect(Collectors.joining("1Z0-")) ;
        System.out.println(result);


    }
}
