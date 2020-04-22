package com.vkeonline.enthuware;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FoundationTestTest {
    /**
     * convert integer to float, lost precision
     */
    @Test
    public void checkFloatConversion() {
        int i = 1234567890 ;
        float f = i ;
        int result = i - (int)f;
        System.out.println(i + " " + f);
        assertNotEquals(0, result);
    }

    /**
     * 1) String is a final class
     * 2) super(); is automatically added if the sub class constructor doesn't
     * call any of the super class's constructors.
     */
    @Test
    public void testSuper() {
//        class MyString extends String {
//            MyString() { super();}
//        }
    }

    /**
     * legal module names:
     *
     * 1) Module names must be valid Java identifiers! I.e. no Java keywords, no dashes, no…
     *  1.1) keywords is not allowed
     *  1.2) not "-"
     * 2) Module names must be reverse-DNS, just like package names, e.g. org.joda.time.
     */
    @Test
    public void checkValidModuleNames() {

    }

    @Test
    public void checkAbstractClass() {
        abstract class A {} ;
        abstract class B extends A {}
        abstract class C {
            abstract void m1() ;
            final private int i = 0 ;
        }
        class D extends C {
            @Override
            void m1() {}
        }

        class E extends D {
            public E(String s) {}
            public E() {
                super() ;
                int i = 0 ;
            }
            @Override
            protected void m1() {}
        }
    }

    @Test
    public void checkEquals() {
        Integer i1 = 1 ;
        Integer i2 = Integer.valueOf(1) ;
        int i3 = 1 ;
        Byte b1 = 1 ;
        Long g1 = 1L ;

        assertNotSame(i1, i2);
        assertEquals((int) i1, i3);
        // won't compile
        // assertFalse(i1 == b1);
        assertEquals(i1, i2);
        // An integer object is not equal to Byte object
        assertNotEquals(i1, b1);

        int[] a = {1,2} ;
    }

    @Test
    public int checkSwitchBlock() {
        int i = 0;
        switch (i) {

        }

        long l = 0L;
        switch ((int) l) {
            case 0:
                return 0;
            default:
                break;
            case 1:
                return 1;
        }

        if(false) ; else ;

        return 0 ;
    }

    @Test
    public void checkSubstring() {
        String string = "String isa string" ;
        assertEquals("ing", string.substring(3,6));

        String t1, t2, t3, t4 ;
        t1 = t2 = new String("a") ;
        t3 = new String("b") ;

        int[] a = {} ;

    }

    @Test
    public void checkOperators() {
        // & && ~ %  operands
        int i = 1 ;
        boolean b = false ;
        assertEquals(0, i & 2);
    }

    @Test
    public void checkStringMethods() {
        String s = "1" ;
        assertEquals("1111111111",s.repeat(10)) ;
        char ch = s.charAt('2') ;
    }

}