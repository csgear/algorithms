package com.vkeonline.lintcode.p000;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumWindowSubstringTest {
    MinimumWindowSubstring minimumWindowSubstring = new MinimumWindowSubstring() ;

    @Test
    void minWindow() {
        String source = "adobecodebanc", target = "abc" ;

        String expected = "banc" ;

        assertEquals(expected, minimumWindowSubstring.minWindow(source, target));
    }
}