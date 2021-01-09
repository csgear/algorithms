package com.vkeonline.leetcode.year2020.oct;

/**
 * @author csgear
 */
public class BuyAndSellStock4 {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        if (n == 0 || k == 0) {
            return 0;
        }

        if (k >= n / 2) {
            int res = 0;
            for (int i = 1; i < n; i++) {
                res += Math.max(0, prices[i] - prices[i - 1]);
            }

            return res;
        }

        int[][] dp = new int[k + 1][n];

        for (int i = 1; i < dp.length; i++) {
            int maxDiff = -prices[0];
            for (int j = 1; j < dp[0].length; j++) {
                maxDiff = Math.max(maxDiff, dp[i - 1][j - 1] - prices[j]);
                dp[i][j] = Math.max(dp[i][j - 1], maxDiff + prices[j]);
            }
        }

        return dp[k][n - 1];
    }
}
