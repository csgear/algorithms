package com.vkeonline.leetcode.sept;

import org.junit.jupiter.api.Test;

class SubArrayProdTest {

    @Test
    void numSubarrayProductLessThanK() {
        SubArrayProd subArrayProd = new SubArrayProd();

        int[] nums = {10, 5, 2, 6};
        int k = 100;

        System.out.println(subArrayProd.numSubarrayProductLessThanK(nums, k));

    }
}