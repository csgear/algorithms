package com.vkeonline.whizlabs;

import java.util.stream.Stream;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    public String toString() {
        return "Whizlabs";
    }
}

class Question6 {
    public static void main(String[] args) {
        Stream<Person> stream = Stream.of(new Person("John"));
        stream.map(p -> p.name = "Jane").forEach(System.out::println);
    }
}


