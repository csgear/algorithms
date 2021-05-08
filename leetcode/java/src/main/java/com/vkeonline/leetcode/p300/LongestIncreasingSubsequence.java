package com.vkeonline.leetcode.p300;

/**
 * Leetcode [M] 300. Longest Increasing Subsequence
 *
 * @author csgear
 */
public class LongestIncreasingSubsequence {
    public int longestIncreasingSubsequence(int[] nums) {
        if(nums.length == 0) {
            return 0 ;
        }
        int[] dp = new int[nums.length] ;
        dp[0] = 1 ;
        int result = 1 ;
        for (int i = 1; i < nums.length; i++) {
            int maxVal = 0 ;
            for (int j = 0; j < i; j++) {
                if(nums[i] > nums[j]) {
                    maxVal = Math.max(maxVal, dp[j]);
                }
            }
            dp[i] = maxVal + 1;
            result = Math.max(dp[i], result) ;
        }

        return result ;
    }
}
