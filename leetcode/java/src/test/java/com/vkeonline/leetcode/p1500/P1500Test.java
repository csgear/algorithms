package com.vkeonline.leetcode.p1500;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author csgear
 */
class P1500Test {

    @Test
    void longestAwesome() {
        LongestAwesomeString longestAwesomeString = new LongestAwesomeString() ;
        String s = "3242415" ;
        int expected = 5 ;
        assertEquals(expected, longestAwesomeString.longestAwesome(s));
    }

    @Test
    void maxSum() {
        GetMaximumScore getMaximumScore = new GetMaximumScore() ;
        int[] nums1 = {1,3,5,7,9} ;
        int[] nums2 = {3,5,100} ;
        int expected = 109 ;
        assertEquals(expected, getMaximumScore.maxSum(nums1, nums2));
    }
}