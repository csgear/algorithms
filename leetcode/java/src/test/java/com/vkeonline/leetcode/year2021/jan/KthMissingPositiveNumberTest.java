package com.vkeonline.leetcode.year2021.jan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KthMissingPositiveNumberTest {
    KthMissingPositiveNumber kthMissingPositiveNumber = new KthMissingPositiveNumber();

    @Test
    void findKthPositive() {
        int[] arr = {1, 2, 3, 4};
        int k = 2;
        int expected = 6;

        assertEquals(expected, kthMissingPositiveNumber.findKthPositive(arr, k));

    }
}