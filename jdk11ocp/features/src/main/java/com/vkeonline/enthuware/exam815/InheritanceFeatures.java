package com.vkeonline.enthuware.exam815;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;


class FeatureA {
    public void methodA(Collection c) {
        System.out.println("In featureA collection");
    }
}

class FeatureB extends FeatureA{
    @Override
    public void methodA(Collection c) {
        System.out.println("In featureB collection");

    }

    public void methodA(List c) {
        System.out.println("In featureB list");
    }

    public static void main(String[] args) {
        Collection c = new ArrayList() ;
        List l = new ArrayList() ;

        FeatureA foo = new FeatureB() ;
        FeatureB bar = new FeatureB() ;
        foo.methodA(c);
        bar.methodA(c);
        bar.methodA(l);

    }
}


/**
 * 1) All variables in an interface are static and public
 * 2) Methods can be private in interface
 * 3)
 */
public class InheritanceFeatures {

    /**
     * Note: in java, an interface is not a class, you can not say A a = (I) a ;
     * but I i = a is valid
     */

    public static void main(String[] args) {

    }

}

class BaseT {
    public <T> List<T> transform(List<T> list) {
        return new ArrayList<T>();
    }

    public <T extends CharSequence> Collection<String> transform(Collection<T> list) {
        return new ArrayList<String>();
    }
}

class DerivedT extends BaseT {

//    public Collection<String> transform(Collection<String> list) {
//        return new HashSet<String>();
//    } ;

//    public <T extends String> Collection<T> transform(Collection<T> list) {
//        return new HashSet<T>();
//    } ;

//    public <T extends CharSequence> List<T> transform(Collection<T> list) {
//        return new ArrayList<T>();
//    } ;

    @Override
    public <T extends CharSequence> Collection<String> transform(Collection<T> list) {
        return new HashSet<String>();
    }

    ;

//    public <T super String> Collection<T> transform(List<String> list) {
//        return new HashSet<T>();
//    } ;

//    public Collection<CharSequence> transform(Collection<CharSequence> list) {
//        return new HashSet<CharSequence>();
//    } ;
}