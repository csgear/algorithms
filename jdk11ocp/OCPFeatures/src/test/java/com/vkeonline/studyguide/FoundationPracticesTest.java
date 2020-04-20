package com.vkeonline.studyguide;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.locks.ReentrantLock;
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

    /**
     * floor means less than or equal
     * ceiling means greater than or equal
     */
    @Test
    public void navigableSetMethod() {
        NavigableSet<String> set = new TreeSet<>() ;
        set.add("a") ; set.add("b") ; set.add("c") ;
        set.add("aa") ; set.add("bb") ; set.add("cc") ;

        assertEquals("a", set.floor("a"));
        System.out.println(set.ceiling("aaa"));
        System.out.println(set.lower("a"));
        assertEquals("c", set.higher("bb"));
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

    @Test
    void checkCallable() {
        try {
            ft.checkCallable();
        }
        catch (InterruptedException | ExecutionException e) {
            System.err.println(e.getMessage());
        }
    }
}