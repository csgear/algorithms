package com.vkeonline.leetcode.p300;

/**
 * Leetcode [M]: 376. Wiggle Subsequence
 * @author csgear
 */
public class WiggleSubsequence {
    public int wiggleMaxLength(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        int up;
        int down;
        up = down = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                up = down + 1;
            } else if (nums[i] < nums[i - 1]) {
                down = up + 1;
            }
        }
        return Math.max(up, down);
    }
}
