package com.vkeonline.studyguide;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.* ;

import java.sql.DriverManager;
import java.util.*;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.IntFunction;
import java.util.stream.IntStream;

class FoundationPracticesTest {
    FoundationPractices ft = new FoundationPractices() ;

    @Test
    public void whatStreamContains() {
        System.out.println(IntStream.range(1,6).count()) ;
    }

    @Test
    public void ReentrantLockTest() {
        ReentrantLock rlock = new ReentrantLock() ;
        if(rlock.tryLock()) {
            
        }

    }
    @Test
    public void navigableSetMethod() {
        NavigableSet<String> set = new TreeSet<>() ;
        set.add("a") ; set.add("b") ; set.add("c") ;
        set.add("aa") ; set.add("bb") ; set.add("cc") ;

        System.out.println(set.floor("a"));
        System.out.println(set.ceiling("aaa"));
        System.out.println(set.lower("a"));
        System.out.println(set.higher("bb"));


    }
    @Test
    void getLocaleCountry() {
        ft.getLocaleCountry();
    }

    @Test void printIt() {
        Collection<String> list = new ArrayDeque<>() ;
        list.add("tom") ;
        list.add("dicker") ;
        for(String s: list) System.out.println(s);
    }
}