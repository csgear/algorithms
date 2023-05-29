package com.vkeonline.leetcode.p600;

/**
 * Leetcode [E]: 674. Longest Continuous Increasing Subsequence
 * @author csgear
 */
public class LongestContinuousIncreasingSubsequence {

    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0)
            return 0;

        int lenSoFar = 1, maxLen = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            lenSoFar = nums[i + 1] > nums[i] ? lenSoFar + 1 : 1;
            maxLen = Math.max(maxLen, lenSoFar);
        }
        return maxLen;

    }
}
