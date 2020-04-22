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
     *  6) The name of the class to be executed must be specified in the --module option along with the module name. i.e.
     *      in moduleName/className format. The class name can be avoided if the jar file's manifest has an
     *      appropriate Main-Class entry. (not in module-info.java but in java manifest)
     *  7) Instance methods are overridden and variables (and static methods) are hidden. Which instance method is invoked
     *      depends on the class of the actual object, while which field (and static method) is accessed depends on
     *      the class of the variable.
     */


    /**
     * Steps to check for valid override
     *    1) First, check the method signature (i.e. method name and the parameter list). If the signature of
     *      the method in the subclass matches the signature of the method in the super class, then it could be
     *      a valid override, otherwise it is just an overloaded method. Note that signature does not include parameter
     *      names and parameter's generic type specification.
     *    2) Second, if it is a potential override, check the generic type specification of the parameters. If the
     *      overriding method does not use a generic type specification for the parameter type, then it is valid.
     *      The reverse is not valid i.e. the overriding method is allowed to erase the generic type specification
     *      but is not allowed to add a generic type specification if the overridden method does not have it.
     *      If both the methods have a generic type specification, then the specification must match exactly.
     *      For example, if the overridden method has Set<Integer>, then the overriding method can use Set or Set<Integer>.
     *      But if overridden method has Set, then the overriding method must also have Set for a valid override.
     *    3) Third, if it is a potential override, check the return type. Java allows "covariant" returns, which means,
     *      the return type of the overriding method must be the same or be a subtype of the return type mentioned in the
     *      overridden method. Check the two return types without the generic type specification. If return type of the
     *      overriding method is covariant with respect to the return type of the overriding method
     *      (for example, ArrayList is covariant with List), then perform the same check including the generic type specification
     *      (for example, ArrayList<CharSequence> is covariant with List<? extends CharSequence>).
     */

    /**
     *  Rule of Covariant Returns
     * 1) An overriding method (i.e. a sub class's method) is allowed to return a sub-type of the type returned by the overridden
     *      method (i.e. super class's method).
     * 2) so, first check whether the return type of the overriding method is a subtype. For example, if the overridden method returns List,
     *      the overriding method can return ArrayList but not Object.
     * 3) Next, you need to check the type specification of generic types.
     *    3.1) assuming that S is a sub type of T and <<< means "is a subtype of", for example Integer is a sub type of Number
     *    3.2) Hierarchy 1 : A<S> <<< A<? extends S> <<< A<? extends T>, List<Integer> is a sub type of List<? extends Integer>
     *        and List<? extends Integer> is a sub type of List<? extends Number>
     *    3.3) A<T> <<< A<? super T> <<< A<? super S>, List<Number> is a subtype of List<? super Number> and List<? super Number>
     *        is a subtype of A<? super Integer>
     *    3.4) List<Integer> is not a subtype of List<Number> even though Integer is a subtype of Number
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