package com.vkeonline.enthuware;

class ScopeTest {
    static int x = 5 ;

    public static void main(String[] args) {
        int x = (x = 3) * 4 ;
        System.out.println(x) ;
    }
}


/**
 * 1) even getInstance() returns null, but url is a static variable
 * 2) compiler will output DatabaswWrapper.url without any error
 */
class DatabaseWrapper {
    // This is an old jdbc connection url
    static String url = "jdbc://derby://localhost:1527//mydb" ;

    static DatabaseWrapper getInstance() {
        System.out.println("GETTING DB");
        return null ;
    }

    public static void main(String[] args) {
        System.out.println(getInstance().url);
    }
}

/**
 *  Note:
 *  1) the static statements/blocks are called in ORDER
 *  2) the initializer statements/blocks are called
 *  3) so a,c,b will be printed in such order
 */
class InitTest {
    static String s1 = sM1("a") ;

    {
        s1 = sM1("b") ;
    }

    static {
        s1 = sM1("c") ;
    }

    public static void main(String[] args) {
        new InitTest() ;
    }

    static String sM1(String s) {
        System.out.println(s) ;
        return  s ;
    }
}

public class EncapsulationFeatures {
    // Will test their initial values
    static char ch ;
    static float f ;
    static boolean b ;

    public void checkMemberAccess() {
        class TestClass {
            char c ;
            public void m1() {
                char[] cA = {'a', 'b'} ;
                m2(c, cA) ;
                System.out.println( ((int) c) + " " + cA[1]) ;
            }
            public void m2(char c, char[] cA) {
                c = 'c' ;
                cA[1] = cA[0] = 'm' ;
            }

        }
        new TestClass().m1() ;
    }

    /**
     *  1) the ch is initialized to 0, which print empty
     */
    public void checkInitialValues() {
        System.out.println(f);
        System.out.println(ch);
        System.out.println(b) ;

    }
}
