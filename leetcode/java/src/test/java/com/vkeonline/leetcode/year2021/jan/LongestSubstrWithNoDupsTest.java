package com.vkeonline.leetcode.year2021.jan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstrWithNoDupsTest {
    LongestSubstrWithNoDups longestSubstrWithNoDups = new LongestSubstrWithNoDups() ;

    @Test
    void lengthOfLongestSubstring() {
        String input = "abcabcbb" ;
        int expected = 3 ;

        assertEquals(expected, longestSubstrWithNoDups.lengthOfLongestSubstring(input));
    }
}