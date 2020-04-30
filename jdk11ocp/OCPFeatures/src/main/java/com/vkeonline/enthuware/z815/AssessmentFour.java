package com.vkeonline.enthuware.z815;

interface I1 {

    void test();

    //static method
    static void hello() {
        System.out.println("hello from Interface I1");
    }

    // default need not to be implemented by implementing class
    default void hello(String name) {
        System.out.println("Hello " + name);
    }
}

class Test2 implements I1 {
    @Override
    public void test() {
        System.out.println("testing 1234...");
    }

    @Override
    public void hello(String name) {
        System.out.println("bonjour " + name);
    }
}


class Test {
    public static void main(String[] args) {
        // Accessing the static member
        I1.hello();

        // Anonymous class Not overriding the default method
        I1 t = new I1() {
            @Override
            public void test() {
                System.out.println("Anonymous test");
            }
        };
        t.test();
        t.hello("Anonymous");

        // Referring to class instance with overridden default method
        I1 t1 = new Test2();
        t1.test();
        t1.hello("xyz");
    }
}


public class AssessmentFour {
}
