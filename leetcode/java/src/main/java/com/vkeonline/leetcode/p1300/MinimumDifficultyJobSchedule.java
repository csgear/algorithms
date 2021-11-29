

package com.vkeonline.leetcode.p1300;

import java.util.Arrays;


/**
 * Leetcode [H]: 1335. Minimum Difficulty of a Job Schedule
 * @author csgear
 */
public class MinimumDifficultyJobSchedule {
    public int minDifficulty(int[] jobDifficulty, int d) {
        if (d > jobDifficulty.length) {
            return -1;
        }

        int[][] dp = new int[d][jobDifficulty.length];
        for (int[] x : dp) {
            Arrays.fill(x, -1);
        }

        return helper(jobDifficulty, d - 1, 0, dp);
    }

    private int helper(int[] jobDifficulty, int remain, int start, int[][] dp) {

        if (dp[remain][start] != -1) {
            return dp[remain][start];
        }

        int max = 0;

        if (remain == 0) {
            for (int i = start; i < jobDifficulty.length; i++) {
                max = Math.max(max, jobDifficulty[i]);
            }
            dp[remain][start] = max ;
            return dp[remain][start] ;
        }


        int result = Integer.MAX_VALUE;
        for (int i = start; i < jobDifficulty.length - remain; i++) {
            max = Math.max(max, jobDifficulty[i]);
            result = Math.min(result, max + helper(jobDifficulty, remain - 1, i + 1, dp));
        }

        dp[remain][start] = result ;
        return dp[remain][start] ;
    }
}
