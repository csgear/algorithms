package com.vkeonline.studyguide;

import java.util.*;


/**
 * Note:
 * 1) javac --module-source-path src -d out src/foo.bar/f/b/Baz1.java src/foo.bar/f/c/Caz1.java
 * or javac --module-source-path src -d out --module foo.bar
 * 2) All the instance or static variables are given a default values if they are not explicitly initialized.
 * All numeric variable are given a value of zero or equivalent to zero (i.e. 0 for integral types and 0.0 for
 * double/float). Booleans are initialized to false and objects are initialized to null.
 * 3) Note that a final variable can be hidden.
 * 4) jdeps --module-path out out\moduleA\test\A.class The jdeps tool is used to find out all dependencies
 *  of a class file or a jar file. It inspects the given class file (or all class files inside a jar files)
 *  and finds out all the required modules and packages that are referred to by this class or jar file.
 * 5) Modules are not allowed to have circular/cyclic dependencies.
 */
public class AssessmentThree {
    /**
     * final variables must be initialized.
     */
    private final String s = "Name" ;


    /**
     * enum constructor cannot be protected or public
     */
    enum NumberType {
        ONE, TWO ;
        NumberType() {

        }
    }

    public void stringRecap() {
        String s1 = "hello" ;
        StringBuilder sb1 = new StringBuilder("hello") ;

        System.out.println(s1.contentEquals(sb1)) ;

        String s2 = "            " ;
        System.out.println(s2.isBlank() + " " + s2.isEmpty());

        String s3 = " hello world  " ;
        System.out.println("|" + s3.trim() + "|" + s3.strip() + "|" + s3.stripLeading() + "|" + s3.stripTrailing() + "|");

        System.out.println((int)'a' + " " + (int)'A' + " " + ('a' - 'A'));

        String s4 = " **    ** " ;
        System.out.println(s4.trim() + "|" + s4.strip());

        String s5 = String.valueOf(new char[] {'a', 'b', 'c', '4'}, 0, 3) ;

        String s6 = new String(new char[] {'a', 'b', 'c', '4'}, 0, 3) ;

        // StringBuilder delete method
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        sb.delete(0, sb.length());
        System.out.println(sb.toString());
    }


    public void ArraysRecap() {
        int[] aArray = new int[3] ;
        Integer[] bArray = new Integer[3] ;
        aArray[2] = 1 ;
        bArray[0] = 1 ;

        for(int a: aArray) {
            System.out.print(a + " ");
        }

        System.out.println();

        for(Integer b: bArray) {
            System.out.print(b + " ");
        }

        System.out.println();

        try {
            for (int b : bArray) {
                System.out.print(b + " ");
            }
        }
        catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        int[][] spreedSheet = new int[3][] ;

        spreedSheet[0] = new int[3] ;
        spreedSheet[1] = new int[] {1,2,3} ;

        System.out.println(Arrays.deepToString(spreedSheet));
    }
    // be care of with this type of equations
    public void UnaryOpersRecap() {
        int number, result ;
        for(int i = 10 ; i <= 50 ; i+=10) {
            number = i ;
            result = --number - number-- ;
            System.out.println("i = " + i + ", number = " + number + " , result = " + result);
        }
    }

    /**
     * the compilation error here is very subtle
     * Note: Like an if/else statement, a try/catch clause is treated as a partial initialization if all
     * sections do not initialize a variable. The variable i remains uninitialized when the finally clause is executed.
     * If i were initialized to zero when it was declared, A would be correct.
     */
    public void checkException() {
        // i must be initialized
        int i  = 0 ;
        try {
            i = 0;
            System.out.println("i =" + 10 / i++);
        } catch (RuntimeException e) {

        } finally {
            System.out.println("i = " + i);
        }
    }

    public void switchRecap(byte x) {
        switch (x) {
            case 'b':   // 1
            default:   // 2
            case -2:    // 3
            case 80:    // 4
        }

        int number = 0 ;

        // switch block can be empty
        switch (number) {

        }

    }

    public void checkInstanceOf() {

        class A {
        }
        class B1 extends A {
        }
        class B2 extends A {
        }
        class C1 extends B1 {
        }
        class C2 extends B2 {
        }

        C1 objectC1 = new C1();

        System.out.println(objectC1 instanceof B1);
    }


    public void checkOverride() {
        class Base {
            public List<CharSequence> transform(Set<CharSequence> list) {
                return null;
            }
        }
        class Derived extends Base {
//            @Override
//            public ArrayList<CharSequence> transform(Set<CharSequence> list) { return null ;}

//            @Override
//            public List<StringBuilder> transform(Set<CharSequence> list) { return null ;}

            //            public List<Object> transform(Set<CharSequence> list){ return null ;}
            public List<Integer> transform(TreeSet<CharSequence> id) {
                return null;
            }
        }
    }



    /**
     * To override a method in the subclass, the overriding method (i.e. the one in the subclass) MUST HAVE:
     * 1) same name
     * 2) same return type in case of primitives (a subclass is allowed for classes, this is also known as covariant return types).
     * 3) same type and order of parameters
     * 4) it may throw only those exceptions that are declared in the throws clause of the superclass's method
     * or exceptions that are subclasses of the declared exceptions. It may also choose NOT to throw any exception
     * 5) The names of the parameter types do not matter.
     * 6) access level?
     */
    public void checkOverrideAgain() {
        class Base {
            public Set getSet(int a) {
                return null ;
            }
        }

        abstract class Derived extends Base {
            @Override
            public abstract Set getSet(int a) ;
        }
    }
}



