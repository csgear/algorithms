package com.vkeonline.whizlabs;

interface A {
    default void m() {
        System.out.println("A");
    }
}

interface B {
    static void m() {
        System.out.println("B");
    }
}

class  C implements A, B {}

public class Question5 {
    public static void main(String[] args) {
        new C().m();
    }
}
