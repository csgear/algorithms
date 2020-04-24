package com.vkeonline.studyguide;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

interface Flyer {
}

interface Tone {
    void up();
}

class Speak {
    public void Speak(String s) {
        System.out.println("Method name is same as class name");
    }

    public static void main(String[] args) {

        Speak s = new GoodSpeak();
        s.Speak("You!");
        ((GoodSpeak) s).up();
        ((Tone) s).up();
    }
}

class GoodSpeak extends Speak implements Tone {
    public void up() {
        System.out.println("UP UP UP");
    }
}

interface House {
    public default String getAddress() {
        return "101 Main Str";
    }
}

interface Bungalow extends House {
    public default String getAddress() {
        return "101 Smart Str";
    }
}

class MyHouse implements Bungalow, House {
}

class ABCD {
    int x = 10;
    static int y = 20;
}

class MNOP extends ABCD {
    int x = 30;
    static int y = 40;
}

interface T1 {
}

interface T2 {
    int VALUE = 10;

    void m1();
}

interface T3 extends T1, T2 {
    public void m1();

    public void m1(int x);
}



class TestClass {
    static TestClass ref;
    String[] arguments;

    public static void main(String args[]) {
        ref = new TestClass();
        ref.func(args);
    }

    public void func(String[] args) {
        ref.arguments = args;
    }
}

class Super { static String ID = "QBANK"; }

class Sub extends Super{
    static { System.out.print("In Sub"); }
}

class Game {
    public void play() throws Exception   {
        System.out.println("Playing...");
    }
}

class Soccer extends Game {
    public void play(String ball)    {
        System.out.println("Playing Soccer with "+ball);
    }
}

class A {
    public List<? super Integer> getList() {
        return null ;
    }
}


class Test{
    public static void main(String[] args){
        System.out.println(Sub.ID);
    }
}

public class AssessmentThree {


    public void checkHouse() {
        House ci = new MyHouse();  //1
        System.out.println(ci.getAddress()); //2

        float f1 = 1;
        float f2 = 0x0123;
        var f3 = 1.0f;

        StringBuilder sb = new StringBuilder(100);


    }

    public void switchTest(byte x) {
        switch (x) {
            case 'b':   // 1
            default:   // 2
            case -2:    // 3
            case 80:    // 4
        }
    }

    public void checkInstanceOf() {
        class Bird implements Flyer {
        }
        class Eagle extends Bird {
        }
        class Bat {
        }

        Flyer f = new Eagle();
        Eagle e = new Eagle();
        Bat b = new Bat();

        if (f instanceof Bird) System.out.println("f is a Bird");
        if (e instanceof Flyer) System.out.println("e is a Flyer");
        if (b instanceof Flyer) System.out.println("b is a Flyer");

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

    public void checkAssignAndComparision() {
        boolean b1 = false;
        boolean b2 = false;
        if (b2 != (b1 = !b2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
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
}
