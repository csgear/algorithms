package com.vkeonline.leetcode.p1400;

/**
 * Leetcode [E]: 1480. Running Sum of 1d Array
 *
 * @author csgear
 */
public class RunningSum {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length] ;
        result[0] = nums[0] ;
        for(int i = 1 ; i < nums.length ; i++) {
            result[i] = result[i-1] + nums[i] ;
        }
        return result ;
    }
}
