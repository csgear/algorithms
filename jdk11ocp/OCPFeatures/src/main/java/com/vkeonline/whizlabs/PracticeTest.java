package com.vkeonline.whizlabs;

import java.nio.file.Path;
import java.util.stream.Stream;

public class PracticeTest {


    public void checkPath(String[] args) {
        Path path1 = Path.of("a/b") ;
        Path path2 = Path.of("a/c") ;
        System.out.println(path1.resolveSibling(path2));
    }

    class Person {
        String name;

        Person(String name) {
            this.name = name;
        }

        public String toString() {
            return "Whizlabs";
        }
    }

    public void checkPersonStream(String[] args) {
        Stream<Person> stream = Stream.of(new Person("John"));
        stream.map(p -> p.name = "Jane").forEach(System.out::println);
    }


    interface Calculable {
        int change(int i);

        default int change(long l) {
            return (int) l * 3;
        }
    }

    public void checkFunctionInterface() {
        Calculable calculable = l -> l * 2;
        System.out.println(calculable.change(1)) ;
    }
}


