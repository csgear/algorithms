package com.vkeonline.lintcode.p500;

import java.util.Arrays;

/**
 * LintCode: 533. Two Sum - Closest to target
 * @author csgear
 */
public class TwoSumCloseToK {
    /**
     * @param nums:   an integer array
     * @param target: An integer
     * @return: the difference between the sum and the target
     */
    public int twoSumClosest(int[] nums, int target) {
        // write your code here

        if (nums == null || nums.length < 2) return -1;

        Arrays.sort(nums);

        int left = 0, right = nums.length - 1;
        int diff = Integer.MAX_VALUE;

        while (left < right) {
            diff = Math.min(diff, Math.abs(nums[left] + nums[right] - target));
            if (nums[left] + nums[right] > target) {
                right--;
            } else {
                left++;
            }
        }

        return diff;
    }
}
