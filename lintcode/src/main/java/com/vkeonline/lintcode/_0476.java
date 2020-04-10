package com.vkeonline.lintcode;

public class _0476 {
    public class Solution {
        /**
         * @param stones: An integer array
         * @return: An integer
         */
        public int stoneGame(int[] stones) {
            if (stones == null || stones.length == 0)
                return 0;

            int n = stones.length;
            int[] preSums = new int[n + 1];

            for (int i = 1; i < n + 1; i++) {
                preSums[i] = preSums[i - 1] + stones[i - 1];
            }

            int[][] dpArray = new int[n][n];

            for (int i = 0; i < n; i++) {
                dpArray[i][i] = 0;
            }

            for (int len = 2; len <= n; len++) {
                for (int i = 0; i <= n - len; i++) {
                    int j = i + len - 1;
                    dpArray[i][j] = Integer.MAX_VALUE;

                    for (int m = i; m < j; m += 1) {
                        dpArray[i][j] = Math.min(dpArray[i][j],
                                dpArray[i][m] + dpArray[m + 1][j]);
                    }
                    dpArray[i][j] += preSums[j + 1] - preSums[i];
                }
            }

            return dpArray[0][n - 1];
        }
    }
}
