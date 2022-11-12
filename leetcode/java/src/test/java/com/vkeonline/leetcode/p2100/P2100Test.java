package com.vkeonline.leetcode.p2100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiaojun.yang
 */
class P2100Test {

    @Test
    void longestPalindrome() {
        String[] words = {"lc","cl","gg"} ;
        LongestPalindrome longestPalindrome = new LongestPalindrome() ;
        int expected = 6 ;
        assertEquals(expected, longestPalindrome.longestPalindrome(words));
    }
}