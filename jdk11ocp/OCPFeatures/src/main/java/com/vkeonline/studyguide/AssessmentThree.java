package com.vkeonline.studyguide;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


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
    public void switchTest(byte x) {
        switch (x) {
            case 'b':   // 1
            default:   // 2
            case -2:    // 3
            case 80:    // 4
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

    public void checkStringBuilderApi() {
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        sb.delete(0, sb.length());
        System.out.println(sb.toString());
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
