package com.vkeonline.leetcode.p000;

/**
 * Leetcode [E]: 746. Min Cost Climbing Stairs
 * @author csgear
 */
public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length ;
        int[] dp = new int[n + 1] ;

        for(int i = 2 ; i <= n ; i++ ) {
            int oneStep = dp[i-1] + cost[i-1] ;
            int twoStep = dp[i-2] + cost[i-2] ;
            dp[i] = Math.min(oneStep, twoStep) ;
        }

        return dp[n] ;
    }
}
