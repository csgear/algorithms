package com.vkeonline.leetcode.april;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfArrayExceptSelfTest {
    static ProductOfArrayExceptSelf poes = new ProductOfArrayExceptSelf() ;

    @Test
    void productExceptSelf() {
        int[] nums = {1,2,3,4} ;

        assertArrayEquals(new int[] {24,12,8,6}, poes.productExceptSelf(nums)) ;
    }
}