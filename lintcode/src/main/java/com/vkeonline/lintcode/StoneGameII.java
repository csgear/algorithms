package com.vkeonline.lintcode;

/**
 * LintCode: 593. Stone Game II
 */
public class StoneGameII {

    /**
     * @param str: a string of numbers
     * @return: the maximum value
     */
    public int maxValue(String str) {
        // write your code here
        int n = str.length();

        int[] d = new int[n];

        for (int i = 0; i < n; i++)
            d[i] = str.charAt(i) - '0';

        int[][] dp = new int[n][n];

        // initial state
        for (int i = 0; i < n; i++) dp[i][i] = d[i];

        // try every length
        for (int l = 2; l <= n; l++) {
            for (int i = 0; i < n - l + 1; i++) {
                int j = i + l - 1;
                for (int k = i; k < j; k++) {
                    dp[i][j] = Math.max(dp[i][j], dp[i][k] + dp[k + 1][j]);
                    dp[i][j] = Math.max(dp[i][j], dp[i][k] * dp[k + 1][j]);
                }
            }
        }

        return dp[0][n - 1];
    }
}

