package com.vkeonline.enthuware;

class NewException extends Exception {}
class AnotherException extends Exception {} ;

/**
 * Notes:
 * 1) final will always execute unless System.exit(0) is called
 * 2) The exception which is thrown outside try block will be handled by caller
 */
public class ExceptionFeatures {
    public static void whichException(String[] args) throws Exception {
        try {
            m2();
        }
        finally {
            m3() ;
        }
    }


    /**
     * the NullPointerException is never thrown, because m1() throws an exception,
     * thus [ ] will not be evaluated.
     * @throws Exception
     */
    public static void arrayException() throws Exception {
        int[] a = null ;
        int i = a [m1()] ;
    }

    public static int m1() throws Exception {throw  new Exception("Some exception") ;}
    public static void m2() throws NewException { throw new NewException() ;}
    public static void m3() throws AnotherException { throw  new AnotherException() ;}
}
