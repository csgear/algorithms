package com.vkeonline.enthuware;


class Game {
    static int x = 5;

    public void play() throws Exception {
        System.out.println("Playing...");

        int x = (x = 3) * 4;
    }


    void test(int x) {
        switch (x) {
            case 1:
            case 2:
            case 0:
            default:
            case 4:
            case 'a' | 'b':
                System.out.println('c');
        }
    }
}

class Soccer extends Game {


    @Override
    public void play() {
        System.out.println("Playing Soccer...");
    }


    public static void main(String[] args) throws Exception {

        int index = 1;
        String[] strArr = new String[5];
        String myStr = strArr[index];
        System.out.println(myStr);

    }
}


class ParamTest {
    public static void printSum(int a, int b) {
        System.out.println("In int " + (a + b));
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println("In Integer " + (a + b));
    }

    public static void printSum(double a, double b) {
        System.out.println("In double " + (a + b));
    }

    public static void main(String[] args) {
        Integer val1 = Integer.valueOf(5) ;
        int val2 = 9;
        testInts(val1++, ++val2);
        System.out.println(val1 + " " + val2);
    }

    public static void testInts(Integer obj, int var) {
        obj = var++;
        obj++;
    }
}


interface ConstTest {
    public int A = 1;
    int B = 1;
    static int C = 1;
    final int D = 1;
    public static int E = 1;
    public final int F = 1;
    static final int G = 1;
    public static final int H = 1;
}

interface Device {
    public abstract void switchOn();
}

abstract class Router /* LOCATION 1 */ {    /* LOCATION 2 */
    public void switchOn() {
    }

    public abstract void reset();
}

class MimoRouter extends Router implements Device {

    @Override
    public void reset() {
    }
}

class TestClass {
    public static void main(String[] args) {
        try {
            doTest();
        } catch (MyException me) {
            System.out.println(me);
        }
    }

    static void doTest() throws MyException {
        int[] array = new int[10];
        array[10] = 1000;
        doAnotherTest();
    }

    static void doAnotherTest() throws MyException {
        throw new MyException("Exception from doAnotherTest");
    }
}

class MyException extends Exception {
    public MyException(String msg) {
        super(msg);
    }

}

interface Account {
    public default String getId() {
        return "0000";
    }
}

interface PremiumAccount extends Account {
}
