package com.vkeonline.leetcode.year2020.april;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringShiftsTest {
    static StringShifts ss = new StringShifts() ;

    @Test
    void stringShift() {
        String s = "abc" ;
        int[][] shift = {{0,1}, {1,2}} ;
        assertEquals("cab", ss.stringShift(s, shift) ) ;
    }
}