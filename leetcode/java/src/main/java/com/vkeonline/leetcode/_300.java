package com.vkeonline.leetcode;

public class _300 {
    public class Solution {
        public int longestIncreasingSubsequence(int[] nums) {
            int[] f = new int[nums.length];
            int max = 0;
            for (int i = 0; i < nums.length; i++) {
                f[i] = 1;
                for (int j = 0; j < i; j++) {
                    if (nums[j] < nums[i]) {
                        f[i] = Math.max(f[i], f[j] + 1);
                    }
                }
                if (f[i] > max) {
                    max = f[i];
                }
            }
            return max;
        }
    }


}
