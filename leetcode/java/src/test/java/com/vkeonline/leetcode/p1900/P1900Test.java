package com.vkeonline.leetcode.p1900;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiaojun.yang
 */
class P1900Test {

    @Test
    void testMaxAlternatingSum() {
        MaximumAlternatingSubsequenceSum maximumAlternatingSubsequenceSum = new MaximumAlternatingSubsequenceSum() ;
        int[] nums = {4,2,5,3} ;
        int expected = 7 ;
        assertEquals(expected, maximumAlternatingSubsequenceSum.maxAlternatingSum(nums));
    }
}