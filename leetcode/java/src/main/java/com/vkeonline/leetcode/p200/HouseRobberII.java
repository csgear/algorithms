
package com.vkeonline.leetcode.p200;

/**
 * Leetcode [M]: 213. House Robber II
 * @author csgear
 */
public class HouseRobberII {
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int maxExcludeFirst = robHelper(nums, 1, nums.length);
        int maxExcludeLast = robHelper(nums, 0, nums.length - 1);

        return Math.max(maxExcludeFirst, maxExcludeLast);
    }

    private int robHelper(int[] nums, int start, int end) {
        int prevMax = 0;
        int currentMax = 0;

        for (int i = start; i < end; i++) {
            int newMax = Math.max(currentMax, nums[i] + prevMax);
            prevMax = currentMax;
            currentMax = newMax;
        }
        return currentMax;
    }
}
