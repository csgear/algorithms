package com.vkeonline.lintcode;

public class _0593 {
    public class Solution {
        /**
         * @param stones: An integer array
         * @return: An integer
         */
        public int stoneGame2(int[] stones) {
            if (stones == null || stones.length == 0)
                return 0;

            int n = stones.length;
            int[] preSums = new int[2 * n + 1];

            for (int i = 1; i <= 2 * n; i++) {
                preSums[i] = preSums[i - 1] + stones[(i - 1) % n];
            }

            int[][] dpArray = new int[2 * n][2 * n];

            for (int i = 0; i < 2 * n; i++) {
                dpArray[i][i] = 0;
            }

            for (int len = 2; len <= 2 * n; len++) {
                for (int i = 0; i  < 2 * n - len + 1; i++) {
                    int j = i + len - 1;
                    dpArray[i][j] = Integer.MAX_VALUE;

                    for (int m = i; m < j; m++) {
                        dpArray[i][j] = Math.min(dpArray[i][j],
                                dpArray[i][m] + dpArray[m + 1][j]);
                    }
                    dpArray[i][j] += preSums[j + 1] - preSums[i];
                }
            }

            int ans = Integer.MAX_VALUE;

            for (int i = 0; i < n; ++i)
                if (dpArray[i][i + n - 1] < ans)
                    ans = dpArray[i][i + n - 1];
            return ans;
        }
    }
}
