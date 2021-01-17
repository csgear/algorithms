package com.vkeonline.lintcode.p600;

/**
 * LintCode: 665. Range Sum Query 2D - Immutable
 */
public class RangeSumQuery2D {
}

class NumMatrix {

    private int[][] dp ;

    public NumMatrix(int[][] matrix) {
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
