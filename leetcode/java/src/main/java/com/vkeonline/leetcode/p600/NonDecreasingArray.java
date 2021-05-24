package com.vkeonline.leetcode.p600;

/**
 * Leetcode [M] : 665. Non-decreasing Array
 * @author csgear
 */
public class NonDecreasingArray {
    public boolean checkPossibility(int[] nums) {
        int count = 0 ;
        for (int i = 1; i < nums.length ; i++) {
            if(nums[i-1] > nums[i]) {
                if(count == 1) {
                    return false;
                }
                count++ ;
                if(i < 2 || nums[i-2] <= nums[i]) {
                    nums[i-1] = nums[i] ;
                }
                else {
                    nums[i] = nums[i-1] ;
                }
            }
        }

        return true ;
    }
}
