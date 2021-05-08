package com.vkeonline.leetcode.p300;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestIncreasingSubsequenceTest {

    @Test
    void longestIncreasingSubsequence() {
        int[] nums = {10,9,2,5,3,7,101,18} ;
        int expected = 4 ;
        LongestIncreasingSubsequence longestIncreasingSubsequence = new LongestIncreasingSubsequence() ;
        assertEquals(expected,
                longestIncreasingSubsequence.longestIncreasingSubsequence(nums));
    }
}