package com.vkeonline.studyguide;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * The note for OCP Java SE 11 study guide
 * 1)  main, import, packages
 * 2) command lines
 *  2.1) javac
 *  2.2) java, -classpath, -cp, --class-path
 *  2.3) jar -c(reate) -v -f(ile) -C(ontain)
 */
public class AssessmentOne {

    void printAnswers() {
        String answersChapter1 = "" ;
//"""
//                1) B, E
//                2) C, D
//                3) C, D         // Java 11 Single File Source Code, you can run a java file as java xxx.java, no class files will be created
//                4) C, D
//                5) A, C, D, E
//                6) E            // wrong D
//                ** 7) F         // A (wrong)
//                8) A, B
//                9) B
//                10) B, E        // (wrong)
//                11) C, D        // wrong C, D, E
//                12) C, E        // C  (wrong)
//                13) C,
//                14) A, B, C, E  // jar -cvf xxx.jar -C xxx B, E(wrong)
//                15) E           // D (wrong)
//                16) D
//                17) A, E
//                18) C, D, E     // C (wrong)
//                19) B, C        // C (wrong), jre is not longer an option since java 11?
//                20) A, B, E     // -cp -classpath --class-path A, C (wrong)
//                """ ;


    }
}



class PrimitiveClass {
    static boolean b;
    static int[] ia = new int[1];
    static char ch;
    static boolean[] ba = new boolean[1];

    public static void main(String[] args) throws Exception {
        System.out.println((int)ch);

        var x = false;
        if( b ){
            x = ( ch == ia[ch]);
        }
        else x = ( ba[ch] = b );
        System.out.println(x+" "+ba[ch]);
    }
}

class OverrideBase{
    public  <T> Collection<T> getCollection(T t, Integer n)
    {
        return new ArrayList<T>();
    }
}

class DerivedClass extends OverrideBase {

    // this is overriding
    public  <T> List<T> getCollection(T t, Integer m) { return new ArrayList<T>(); }; //1

    // Stream is not a subclass of Collection, and not overload because their method signature is same
    // public  <T> Stream<T> getCollection(T t, Integer m) { return new ArrayList<T>(); }; //2

    // return type
    //public  <T> void getCollection(T t, Integer m) { return new ArrayList<T>(); }; //3

    // this is overloading
    public  <T> List<T> getCollection(String t, Integer m) { return new ArrayList<T>(); }; //4
}

class BaseWithStatic {
    int i = 10;
    public static void m1(){  }
    public void m2() { }
}

class DerivedWithStatic extends BaseWithStatic {
    int i = 20;
    public static void m1() {  }

    /**
     * static m1() in A cannot be overridden by non-static m1()
     */
//    public void m1() {}
    public void m2() { }

    public static void check() {
        BaseWithStatic a  = new DerivedWithStatic();
        System.out.println(a.i)  ; //will print 10 instead of 20
        a.m1();  //will call A's m1
        a.m2();  //will call B's m2 as m2() is not static and so overrides A's m2()
    }
}

class BaseWithException {
    public void play() throws Exception{
        System.out.println("Playing...");
    }
}

class DerivedWithoutException extends BaseWithException{
    public void play(){
        System.out.println("Playing Soccer...");
    }
    public static void main(String[] args){
        BaseWithException g = new BaseWithException();
        // this line won't compile
        // even in runtime, game.play() calls soccer.play()
        // he class of the variable g is of class Game. Therefore, at compile time,
        // compiler assumes that g.play() might throw an exception
        // g.play();
    }
}
