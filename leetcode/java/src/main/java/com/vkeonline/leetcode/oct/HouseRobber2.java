package com.vkeonline.leetcode.oct;

/**
 * @author csgear
 */
public class HouseRobber2 {
    /**
     * When we select the first house, then we cannot select the last house, so we make the (N-2)th house the last house
     * and do the same thing as the generic house robber problem. That is, run the program for indices [0 to N-2].
     *
     * When we do not select the first house, then we can select the last house. In this case,
     * we do the same thing as house robber problem from house number 2 (index 1) to the last house.
     * That is, run the program for indices [1 to N-1].
     */
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return nums[0];
        }

        int maxExcludeFirst = robHelper(nums, 1, nums.length);
        int maxExcludeLast = robHelper(nums, 0, nums.length - 1);

        return Math.max(maxExcludeFirst, maxExcludeLast);
    }

    public int robHelper(int[] nums, int start, int end) {
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
