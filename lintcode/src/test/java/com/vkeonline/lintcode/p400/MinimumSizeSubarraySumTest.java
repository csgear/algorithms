package com.vkeonline.lintcode.p400;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumSizeSubarraySumTest {
    MinimumSizeSubarraySum minimumSizeSubarraySum = new MinimumSizeSubarraySum();

    @Test
    void minimumSize() {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int k = 7;
        int expected = 2;
        assertEquals(expected, minimumSizeSubarraySum.minimumSize(nums, k));
    }
}