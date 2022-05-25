package com.vkeonline.leetcode.p100;

/**
 * Leetcode [E]: 53. Maximum Subarray
 *
 * @author csgear
 */
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE ;
        int current = 0 ;

        for (int num : nums) {
            current = current + num;
            if (max < current) {
                max = current;
            }

            if (current < 0) {
                current = 0;
            }
        }

        return max ;
    }
}
