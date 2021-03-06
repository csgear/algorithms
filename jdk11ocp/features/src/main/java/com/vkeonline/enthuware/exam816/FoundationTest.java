package com.vkeonline.enthuware.exam816;


import java.util.Optional;

/**
 * @author csgear
 */
public class FoundationTest {
    static class Device implements AutoCloseable {
        boolean open;
        int index;

        public Device(int index) {
            this.index = index;
            open = true;
        }

        public void write() {
            throw new RuntimeException("Can't write!");
        }

        @Override
        public void close() {
            open = false;
            System.out.println("Device closed " + index);
        }
    }

    static class SpecialPicker<K> {
        public K pickOne(K k1, K k2) {
            return k1.hashCode() > k2.hashCode() ? k1 : k2;
        }
    }

    public static void main(String[] args) {
        Device d1 = new Device(1);
        try (d1; Device d2 = new Device(2)) {
            d2.write();
        } catch (Exception e) {
            System.out.println("Got Exception " + e.getMessage());
        }

        SpecialPicker<Integer> specialPicker = new SpecialPicker<>();
        System.out.println(specialPicker.pickOne(1, 2) + 1);

        funWithOptional();
    }

    static String getValue() {
        return null;
    }

    static void funWithOptional() {
        Optional<String> stro = Optional.of(getValue());
        System.out.println(stro.isPresent());
        System.out.println(stro.get());
        System.out.println(stro.orElse(null));
    }
}


class OptionalClass {
    public static Optional<String> getGrade(int marks) {
        Optional<String> grade = Optional.empty();
        if (marks > 50) {
            grade = Optional.of("PASS");
        } else {
            Optional.of("FAIL");
        }
        return grade;
    }

    public static void main(String[] args) {
        Optional<String> grade1 = getGrade(50);
        Optional<String> grade2 = getGrade(55);
        System.out.println(grade1.orElse("UNKNOWN"));
        if (grade2.isPresent()) {
            grade2.ifPresent(System.out::println);
        } else {
            System.out.println(grade2.orElse("Empty"));
        }
    }
}

class Outer {
    int i = 10;

    /**
     * access outer class variable
     */
    class Inner {
        public void methodA() {
            System.out.println(i);
            System.out.println(Outer.this.i);
        }
    }
}

