package com.vkeonline.leetcode.p700;

/**
 * Leetcode [M]: 746. Min Cost Climbing Stairs
 * @author csgear
 */
public class MinCostClimbingStairs {

    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 1];

        int n = cost.length;

        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i <= n; i++) {
            dp[i] = Math.min(dp[i - 2] + cost[i - 2], dp[i - 1] + cost[i - 1]);
        }

        return dp[n];
    }
}
