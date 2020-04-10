package com.vkeonline.leetcode;

public class _931 {
    class Solution {
        public int minFallingPathSum(int[][] A) {
            int n = A.length;
            int topLeft, topRight;

            for (int i = 1; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    topLeft = A[i - 1][Math.max(j - 1, 0)];
                    topRight = A[i - 1][Math.min(j + 1, n - 1)];
                    A[i][j] += Math.min(A[i - 1][j], Math.min(topLeft, topRight));
                }
            }

            int result = A[n - 1][0];

            for (int j = 1; j < n; ++j) {
                result = Math.min(result, A[n - 1][j]);
            }

            return result;
        }
    }
}
