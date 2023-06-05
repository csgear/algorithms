package com.vkeonline.leetcode.p1100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiaojun.yang
 */
class P1100Test {

    @Test
    void maxRepOpt1() {
        String text = "aaabaaa" ;
        int expected = 6 ;
        SwapLongestRepeatedCharacterSubstring swapLongestRepeatedCharacterSubstring =
                new SwapLongestRepeatedCharacterSubstring() ;
        assertEquals(expected, swapLongestRepeatedCharacterSubstring.maxRepOpt1(text));
    }
}