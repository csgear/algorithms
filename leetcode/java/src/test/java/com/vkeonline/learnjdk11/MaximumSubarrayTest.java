package com.vkeonline.learnjdk11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarrayTest {

    @Test
    void maxSubArray() {
        MaximumSubarray ms = new MaximumSubarray() ;
        int[] nums =  {-2,1,-3,4,-1,2,1,-5,4} ;

        System.out.println((ms.maxSubArray(nums)));
    }
}