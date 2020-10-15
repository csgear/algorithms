package com.vkeonline.leetcode.july;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {

    @Test
    void threeSum() {
        int[] nums = {-1, 0, 1, 2, -1, -4} ;

        ThreeSum threeSum = new ThreeSum() ;
        threeSum.threeSum(nums) ;
    }
}