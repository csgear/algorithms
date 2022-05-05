package com.vkeonline.leetcode.p1000;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class P1000Test {

    @Test
    void longestStrChain() {
        LongestStringChain longestStringChain = new LongestStringChain();
        String[] words = {"xbc", "pcxbcf", "xb", "cxbc", "pcxbc"};
        int expected = 5;
        assertEquals(expected, longestStringChain.longestStrChain(words));
    }

    @Test
    void carPooling() {
        CarPooling carPooling = new CarPooling() ;

        int[][] trips = {{2,1,5},{3,3,7}} ;
        int capacity = 4 ;
        boolean expected = false ;
        assertEquals(expected, carPooling.carPooling(trips, capacity));
    }
}
