package com.vkeonline.lintcode.p300;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringKTest {
    LongestSubstringK longestSubstringK = new LongestSubstringK() ;

    @Test
    void lengthOfLongestSubstringKDistinct() {
        String S = "WORLD" ;
        int  k = 4 ;
        int expected = 4 ;

        assertEquals(expected, longestSubstringK.lengthOfLongestSubstringKDistinct(S, k));
    }
}