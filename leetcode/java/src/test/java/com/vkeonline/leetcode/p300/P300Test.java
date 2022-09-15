package com.vkeonline.leetcode.p300;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


class P300Test {

    @Test
    void wiggleMaxLength() {
        WiggleSubsequence wiggleSubsequence = new WiggleSubsequence();
        int[] nums = {1, 17, 5, 10, 13, 15, 10, 5, 16, 8};
        int expected = 7;
        assertEquals(expected, wiggleSubsequence.wiggleMaxLength(nums));
    }

    @Test
    void longestIncreasingSubsequence() {
        int[] nums = {10,9,2,5,3,7,101,18} ;
        int expected = 4 ;
        LongestIncreasingSubsequence longestIncreasingSubsequence = new LongestIncreasingSubsequence() ;
        assertEquals(expected,
                longestIncreasingSubsequence.longestIncreasingSubsequence(nums));
    }


    @Test
    void maxProduct() {
        MaximumProductWordLengths maximumProductWordLengths = new MaximumProductWordLengths() ;
        String[] words = {"a","ab","abc","d","cd","bcd","abcd"} ;
        int expected = 4 ;
        assertEquals(expected, maximumProductWordLengths.maxProduct(words));
    }
}
