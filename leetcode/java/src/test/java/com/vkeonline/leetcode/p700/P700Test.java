package com.vkeonline.leetcode.p700;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class P700Test {
    @Test
    void numSubarrayProductLessThanK() {
        SubArrayProd subArrayProd = new SubArrayProd();

        int[] nums = {10, 5, 2, 6};
        int k = 100;
        int expected = 8 ;
        assertEquals(expected, subArrayProd.numSubarrayProductLessThanK(nums, k));
    }

    @Test
    void findLength() {
        MaximumLengthRepeatedSubarray maximumLengthRepeatedSubarray = new MaximumLengthRepeatedSubarray() ;
        int[] nums1 = {0,0,0,0,0} ;
        int[] nums2 = {0,0,0,0,0} ;
        int expected = 5 ;
        assertEquals(expected, maximumLengthRepeatedSubarray.findLength(nums1, nums2)) ;
    }

}
