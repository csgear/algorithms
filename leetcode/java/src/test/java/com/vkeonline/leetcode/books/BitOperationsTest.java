package com.vkeonline.leetcode.books;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiaojun.yang
 */
class BitOperationsTest {

    @Test
    void getLastDigit() {
    }

    @Test void testCertainOperation() {
        // set last digit to be 1
        int n = 5 ;
        assertEquals(1, n & (-n));
        System.out.println(Integer.toBinaryString(n & (-n)));
        System.out.println(Integer.toBinaryString(~0));
    }
}