package com.vkeonline.leetcode.p1000;

public class _1000 {
    class Solution {
        public int mergeStones(int[] stones, int K) {
            if (stones == null || stones.length == 0 || K <= 1) {
                return -1;
            }

            int n = stones.length;
            if ((n - 1) % (K - 1) != 0) {
                return -1;
            }

            // prefix sum
            int[] preSums = new int[n + 1];
            for (int i = 1; i < n + 1; i++) {
                preSums[i] = preSums[i - 1] + stones[i - 1];
            }

            int[][] dpArray = new int[n][n];

            // initialization
            for (int i = 0; i < n; i++) {
                dpArray[i][i] = 0;
            }

            // calculation
            for (int len = 2; len <= n; len++) {
                for (int i = 0; i <= n - len; i++) {
                    int j = i + len - 1;
                    dpArray[i][j] = Integer.MAX_VALUE;

                        for (int m = i; m < j; m += (K - 1)) {
                            dpArray[i][j] = Math.min(dpArray[i][j],
                                    dpArray[i][m] + dpArray[m + 1][j]);
                        }

                    if ((j - i) % (K - 1) == 0) {
                        dpArray[i][j] += preSums[j + 1] - preSums[i];
                    }
                }
            }

            return dpArray[0][n - 1];
        }

    }
}
