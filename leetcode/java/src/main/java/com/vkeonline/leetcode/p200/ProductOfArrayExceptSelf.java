package com.vkeonline.leetcode.p200;

import java.util.Arrays;

/**
 * Leetcode [M]: 238. Product of Array Except Self
 * @author csgear
 */
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0) {
            return nums ;
        }
        int[] result = new int [nums.length] ;
        Arrays.fill(result, 1);

        int left = 1 ;
        for(int i = 0 ; i < nums.length ; i++) {
            result[i] = left ;
            left *= nums[i] ;
        }

        int right = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= right;
            right *= nums[i];
        }

        return result ;

    }
}
