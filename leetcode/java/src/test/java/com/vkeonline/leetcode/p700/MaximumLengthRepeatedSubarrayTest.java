package com.vkeonline.leetcode.p700;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// File: MaximumLengthRepeatedSubarrayTest
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Author: xiaoyang
//
// Nokia - Confidential
// Do not use, distribute, or copy without consent of Nokia.
// Copyright (c) 2021 Nokia. All rights reserved.
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
class MaximumLengthRepeatedSubarrayTest {
    MaximumLengthRepeatedSubarray maximumLengthRepeatedSubarray = new MaximumLengthRepeatedSubarray() ;

    @Test
    void findLength() {
        int[] nums1 = {0,0,0,0,0} ;
        int[] nums2 = {0,0,0,0,0} ;
        int expected = 5 ;
       assertEquals(expected, maximumLengthRepeatedSubarray.findLength(nums1, nums2)) ;
    }
}
