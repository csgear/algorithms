package com.vkeonline.udemy.section1;

/**
 * Note:
 *  1) main method can be final
 *  2) main method arguments can be the followings
 *      2.1) String[] args
 *      2.2) String args[]
 *      2.3) String... args
 *      2.4) String...args // not space
 *  3) what's is in manifest.txt file:  Main-Class:package.class
 *  4) java -cp
 *  5) jar -cf filename -C
 *  6) javac -cp xxx -d out src/package/*.java
 */
public class TestMain {
    // this is a valid method
    public static void main(final String[] args) throws Throwable {
        main("Hello world") ;
    }

    // this is not a valid main method
    static public void main(String s) throws Exception {
        System.out.println(s);
    }
}
