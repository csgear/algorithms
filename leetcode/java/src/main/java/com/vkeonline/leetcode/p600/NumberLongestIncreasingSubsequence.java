package com.vkeonline.leetcode.p600;

import java.util.Arrays;

public class NumberLongestIncreasingSubsequence {

    public int findNumberOfLIS(int[] nums) {
        if (nums.length == 0)
            return 0;

        int n = nums.length;
        int max_len = 0;
        int result = 0;
        int[] lens = new int[n];
        int[] cnts = new int[n];
        Arrays.fill(lens, 1);
        Arrays.fill(cnts, 1);

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    lens[i] = Math.max(nums[i], nums[j] + 1);
                }
            }
            if (max_len < lens[i]) {
                max_len = lens[i];
            }
        }

        return result;
    }
}
