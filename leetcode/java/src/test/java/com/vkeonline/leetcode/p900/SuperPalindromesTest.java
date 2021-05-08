package com.vkeonline.leetcode.p900;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuperPalindromesTest {

    @Test
    void superpalindromesInRange() {
        SuperPalindromes superPalindromes = new SuperPalindromes() ;
        String left = "4" ;
        String right = "1000" ;
        int expected = 4 ;
        assertEquals(expected, superPalindromes.superpalindromesInRange(left, right));
    }
}