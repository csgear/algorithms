package com.vkeonline.leetcode.year2020.may;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumSumCircularSubarrayTest {
    MaximumSumCircularSubarray maximumSumCircularSubarray = new MaximumSumCircularSubarray();

    @Test
    void maxSubarraySumCircular() {
        int[] A = {1, -2, 3, -2};
        assertEquals(3, maximumSumCircularSubarray.maxSubarraySumCircular(A));
        int[] B = {5, -3, 5};
        assertEquals(10, maximumSumCircularSubarray.maxSubarraySumCircular(B));
    }


}