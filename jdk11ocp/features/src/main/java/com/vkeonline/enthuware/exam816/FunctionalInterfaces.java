package com.vkeonline.enthuware.exam816;

import java.util.function.* ;

class Panda {
    int age ;
    public static void isPandaMatch(String... args) {
        Panda p1 = new Panda() ;
        check(p1, p -> p.age < 5) ;
    }

    private static void check(Panda panda, Predicate<Panda> pred) {
        String result = pred.test(panda) ? "match" : "not match" ;
        System.out.println(result);
    }
}

/**
 * 1) A functional interface is an interface that contains exactly one abstract method.
 * It may contain zero or more default methods and/or static methods.
 * 2) Pre defined FunctionalInterface  (6 of them)
 *  2.3) Consumer, Predict, Supplier, BiConsumer<key, value>
 *  2.4) ArrayList.sort, Comparator { int compareTo(X, y) }, forEach(Consumer?)
 *
 */
public class FunctionalInterfaces {
    public void checkPredicate() {
        Panda.isPandaMatch();
    }


}
