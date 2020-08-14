package com.vkeonline.enthuware.exam816;

import java.util.function.*;

class Panda {
    int age;

    public static void isPandaMatch(String... args) {
        Panda p1 = new Panda();
        check(p1, p -> p.age < 5);
    }

    private static void check(Panda panda, Predicate<Panda> pred) {
        String result = pred.test(panda) ? "match" : "not match";
        System.out.println(result);

    }


}

class MyProcessor {
    int value;

    public MyProcessor() {
        value = 10;
    }

    public MyProcessor(int value) {
        this.value = value;
    }

    public void process() {
        System.out.println("Processing " + value);
    }
}

/**
 * 1) A functional interface is an interface that contains exactly one abstract method.
 * It may contain zero or more default methods and/or static methods.
 * 2) Pre defined FunctionalInterface  (6 of them)
 * 2.3) Consumer, Predict, Supplier, BiConsumer<key, value>
 * 2.4) ArrayList.sort, Comparator { int compareTo(X, y) }, forEach(Consumer?)
 */
public class FunctionalInterfaces {
    public void checkPredicate() {
        Panda.isPandaMatch();
    }

    public static void main(String[] args) {
        Supplier<MyProcessor> supp = MyProcessor::new;
        MyProcessor mp1 = supp.get();
        mp1.process();

        Function<Integer, MyProcessor> f = MyProcessor::new;
        MyProcessor mp2 = f.apply(10);
        mp2.process();

        IntFunction<IntUnaryOperator> fo = a -> b -> a - b;
        int x = operate(fo.apply(20));
        System.out.println(x);
    }


    public static int operate(IntUnaryOperator iuo) {
        return iuo.applyAsInt(5);
    }
}



