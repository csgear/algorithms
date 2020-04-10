package com.vkeonline.leetcode.thirtydays;

import org.junit.jupiter.api.Test;

class MaximumSubarrayTest {

    @Test
    void maxSubArray() {
        MaximumSubarray ms = new MaximumSubarray() ;
        int[] nums =  {-2,1,-3,4,-1,2,1,-5,4} ;

        System.out.println((ms.maxSubArray(nums)));
    }
}