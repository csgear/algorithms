package com.vkeonline.lintcode.p800;

/**
 * Lint code: 817. Range Sum Query 2D - Mutable
 *
 * @author csgear
 */
public class RangeSumQuery2D {
    class NumMatrix {
        private final int m, n;
        private final int[][] matrix, data;

        public NumMatrix(int[][] nums) {
            m = nums.length;
            n = nums[0].length;
            data = new int[m][n];
            matrix = new int[m + 1][n + 1];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    update(i, j, nums[i][j]);
                }
            }
        }


        private int lowbit(int x) {
            return x & (-x);
        }

        private int prefixSum(int row, int col) {
            int sum = 0;
            for (int i = row + 1; i > 0; i = i - lowbit(i)) {
                for (int j = col + 1; j > 0; j = j - lowbit(j)) {
                    sum += matrix[i][j];
                }
            }
            return sum;
        }

        public void update(int row, int col, int val) {
            int delta = val - data[row][col];
            data[row][col] = val;
            for (int i = row + 1; i <= m; i = i + lowbit(i)) {
                for (int j = col + 1; j <= n; j = j + lowbit(j)) {
                    matrix[i][j] += delta;
                }
            }
        }

        public int sumRegion(int row1, int col1, int row2, int col2) {
            return (
                    prefixSum(row2, col2) -
                            prefixSum(row2, col1 - 1) -
                            prefixSum(row1 - 1, col2) +
                            prefixSum(row1 - 1, col1 - 1)
            );
        }

    }
}
