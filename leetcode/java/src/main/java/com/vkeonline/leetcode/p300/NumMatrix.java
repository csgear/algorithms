package com.vkeonline.leetcode.p300;

/**
 * LeetCode: 304. Range Sum Query 2D - Immutable
 * @author csgear
 */


class NumMatrix {
    private int[][] dp = null;

    public NumMatrix(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return;
        int m = matrix.length;
        int n = matrix[0].length;
        dp = new int[m + 1][n + 1];

        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                dp[row + 1][col + 1] = dp[row + 1][col] + dp[row][col + 1] - dp[row][col] + matrix[row][col];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return dp[row2 + 1][col2 + 1] - dp[row1][col2 + 1] - dp[row2 + 1][col1] + dp[row1][col1];
    }
}
