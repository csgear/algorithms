package com.vkeonline.enthuware.exam815;


import java.util.ArrayList;
import java.util.List;

class Base {
    public <T> List<T> transform(List<T> list) {
        return new ArrayList<T>();
    }
}

class Derived extends Base {
//    public ArrayList<Number> transform(List<Number> list) {
//        return new ArrayList<Number>();
//    }

//    public ArrayList<Object> transform(List<Object> list) {
//        return new ArrayList<Object>();
//    }

//    public <T> ArrayList<T> transform(List<T> list) {
//        return new ArrayList<T>();
//    }
}

class A {
    public int getCode(){ return 2;}
}

class AA extends A {
    public void doStuff() {
    }
}
class Test {
    static String str;
    static Float f = null;

    public static Integer wiggler(Integer x) {
        Integer y = x + 10;
        x++;
        System.out.println(x);
        return y;
    }


    final static public void main(String[] args) {
        A a = null ;
        AA aa = null ;

        a = (AA)aa ;
        a = new AA() ;
        aa = (AA)a ;
        ((AA)a).doStuff(); 
    }

}

