package com.vkeonline.leetcode.p300;

public class _378 {
    class Solution {
        public int kthSmallest(int[][] matrix, int k) {
            int m = matrix.length;
            int n = matrix[0].length;
            int low = matrix[0][0];
            int high = matrix[m - 1][n - 1];

            while (low < high) {
                int middle = low + (high - low) / 2;
                int cnt = count(matrix, middle, m, n);
                if (cnt >= k) high = middle;
                else low = middle + 1;
            }
            return low;
        }

        int count(int[][] matrix, int v, int m, int n) {
            int j = n - 1;
            int count = 0;
            for (int i = 0; i < m; i++) {
                while (j >= 0 && matrix[i][j] > v)
                    j--;
                count += j + 1;
            }
            return count;
        }
    }
}
