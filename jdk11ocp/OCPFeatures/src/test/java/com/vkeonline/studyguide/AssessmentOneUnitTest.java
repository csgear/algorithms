package com.vkeonline.studyguide;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AssessmentOneUnitTest {


    // Test1

    /**
     * Note:
     * 1) public interface Function<T,R> : Represents a function that accepts one argument and
     *      produces a result.
     * 2) Another concept (although not related to this question but about static methods)
     *      is that static methods are never overridden. They are hidden just like static or non-static fields.
     * 3) static method cannot be overridden by a non-static method and vice versa
     * 4) If there is no package statement in the source file, the class is assumed to be created in an
     *      unnamed package that has no name. In this case, all the types created in this package will be
     *      available to this class without any import statement.
     * 5) However, note that this unnamed package cannot be imported in classes that belong to any
     *     other package at all, not even with any import statement. So for example, if you have a class
     *     named SomeClass in package test, you cannot access TestClass defined in the problem statement
     *     (as it belongs to the unnamed package) at all because there is no way to import it.
     * 6)
     */

    /**
     * 1) the comparision? between Integer and short, but not Short and Integer
     * 2)
     */
    @Test
    public void checkPrimitiveComparision() {
        short s = 9;
        // check Short definition
        Short k = 9;
        System.out.println(k instanceof Short);
        Integer i = 9;
//        System.out.println(k == i);
        System.out.println(s == i);
    }

    @Test
    public void checkBreakStatement() {
        for (; true; ) break;
        switch (1) {
            default:
                break;
        }
    }

    @Test
    public void checkDoubleIf() {
        if (true)
            if (false)
                System.out.println("True False");
            else
                System.out.println("True True");
    }

    @Test
    public void canBooleanReturn() {
        Boolean b = false;
        while (b) {

        }
    }

    class Automobile {
        public void drive() {
            System.out.println("Automobile: drive");
        }
    }

    class Truck extends Automobile {
        public void Truck() {
        }

        public void drive() {
            System.out.println("Truck: drive");
        }
    }

    @Test
    public void testReusing() {
        Automobile a = new Automobile();
        Truck t = new Truck();
        a.drive(); //1
        t.drive(); //2
        a = t;     //3
        a.drive(); //4
        System.out.println((String) null);
    }


    @Test
    public void primitiveType() {
        return;
    }

    static int x = 5;

    @Test
    public void useVarsX() {
        int x = (x = 3) * 4;
        System.out.println(x);
    }

    @Test
    public void checkArrayListAdd() {
        List list = new ArrayList();
        list.add("val1"); //1
        list.add(2, "val2"); //2
        list.add(1, "val3"); //3
        System.out.println(list);

        var values = new ArrayList<String>();

        values.removeIf((var k)->k.equals("a")) ;
    }

    @Test
    public void checkWhatWhileTakes() {
        int k = 2 ;
//        while(--k) {
//
//        }

        System.out.println(1 + 5 < 3 + 7);
        System.out.println( (2 + 2) >= 2 + 3);
    }

    @Test
    public void checkHowvarWorks() {
//        var k = System.out::println ;
        for(var x : System.getProperties().entrySet()) {
            var m = x.getKey() ;
        };
    }

    // Foundation Test
    interface Aquatic {
        int getNumOfGills(int p);
    }

    final static class A {

    }

    /**
     * inner class can be public, but not method inner class
     */
    public class ClownFish implements Aquatic {

        @Override
        public int getNumOfGills(int p) {
            return 15;
        }

        String getNumOfGills() {
            return "41";
        }
    }

    private class PrivateClass {
    }

    @Test
    void checkAbstract() {
        abstract class Elephant {
            abstract class SleepsALot {
                abstract int sleep();
            }
        }
    }

    @Test
    void testPublicInnerClass() {
        assertEquals(15, new ClownFish().getNumOfGills(-1));

    }

    @Test
    void checkAbstractMethod() {
        abstract class Bird {
            private final void fly() {
                System.out.println(("Bird"));
            }
        }

        class Pelican extends Bird {
            protected void fly() {
                System.out.println("Pelican");
            }
        }

        new PrivateClass();
    }
}