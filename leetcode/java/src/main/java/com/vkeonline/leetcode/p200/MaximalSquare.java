package com.vkeonline.leetcode.p200;

/**
 * Leetcode [M]: 221. Maximal Square
 * @author csgear
 */
public class MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        int n = matrix.length;
        int m = n > 0 ? matrix[0].length : 0;
        int[][] dp = new int[n + 1][m + 1];
        int len = 0;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= m; j++) {

                if (matrix[i - 1][j - 1] == '1') {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                    len = Math.max(len, dp[i][j]);
                }
            }
        }

        return len * len;
    }
}
