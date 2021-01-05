package com.vkeonline.lintcode.p500;

/**
 * 562. Backpack IV
 * @author csgear
 */
public class Backpack4 {
    /**
     * @param nums: an integer array and all positive numbers, no duplicates
     * @param target: An integer
     * @return An integer
     */
    public int backPackIV(int[] nums, int target) {
        int[] dp = new int[target+1] ;
        dp[0] = 1 ;
        for (int num : nums) {
            for (int j = num; j <= target; j++) {
                dp[j] += dp[j - num];
            }
        }

        return dp[target] ;
    }
}
