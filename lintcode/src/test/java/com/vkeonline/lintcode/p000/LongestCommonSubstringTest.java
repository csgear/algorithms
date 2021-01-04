package com.vkeonline.lintcode.p000;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonSubstringTest {
    LongestCommonSubstring longestCommonSubstring = new LongestCommonSubstring() ;

    @Test
    void longestCommonSubstring() {
        String A = "abc" ;
        String B = "a" ;
        int expected = 1 ;

        assertEquals(expected, longestCommonSubstring.longestCommonSubstring(A, B));
    }
}