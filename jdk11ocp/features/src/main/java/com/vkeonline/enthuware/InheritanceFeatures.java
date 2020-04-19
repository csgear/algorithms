package com.vkeonline.enthuware;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


// a method can not contain interface declaration

/**
 * every method except default and static ones are abstract
 */
interface I {
    static void staticMethod() {
        System.out.println("static method") ;
    }

    default void defaultMethod() {
        System.out.println("default method") ;
    }
}

/**
 * 1) All variables in an interface are static and public
 * 2) Methods can be private in interface
 * 3)
 */
public class InheritanceFeatures {

    /**
     * Note: in java, an interface is not a class, you can not say A a = (I) a ;
     * but I i = a is valid
     */
    public void checkInterface() {
        class A implements I {}
        class B extends A {}
        A a = new A() ;
        B b = new B() ;
        I i = a ;
    }

    /**
     * private > default > protected > public
     */
    public void checkOverridingRestrictive() {
        class Base {
            void setF() {}
        }
        class Derived extends Base {
            // public is less restrictive
            // public void setF() {}
            // private is more restrictive, so it will not compile
            // private void setF() {}
        }
    }

    /**
     * 1) inheritance: override and overload (overload is not inheritance)
     * 2) hide implementation and override implementation
     * 3) static and final variables and methods are not inheritable
     * 4) override: covariant / permission restriction / throw scope
     * an overriding method is allowed to return a sub-type of the
     * type returned by the overridden method
     *  1) A<S> <<< A<? extends S> <<< A<? extends T>
     *  for example List<Integer> is subtype of List<? extends Integer> and
     *  List<? extends Integer> is a subtype of List<? extends Number>
     *
     *  2) A<S> <<< A<? super T> <<< A<? super S>
     *  for example, List<Number> is a subtype of List<? super Number> and
     *  List<? super Number> is a subtype of List<? super Integer>
     *
     *  3) List<Number> is not a subtype of List<Integer>
     */
    public void checkOverridingTypes() {
        // How to override a base class method?
        class D1 {
            public ArrayList<Number> transform1(Set<Integer> set) {
                return null ;
            }
            public List<CharSequence> transform2(Set<CharSequence> list) {
                return  null ;
            }
        }

        class D2 extends D1 {
            public ArrayList<Number> transform1(Set list) {
                return null ;
            }
            public ArrayList<CharSequence> transform2(Set<CharSequence> list) {
                return null ;
            }

        }
    }
}
