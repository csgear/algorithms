package com.vkeonline.lintcode.p500;

/**
 * Lint code: 593. Stone Game II
 *
 * @author csgear
 */
public class StoneGame2 {

    /**
     * @param stones: An integer array
     * @return An integer
     */
    public int stoneGame2(int[] stones) {
        if (stones == null || stones.length == 0) {
            return 0;
        }
        int n = stones.length;
        int[] preSums = new int[2 * n + 1];

        for (int i = 1; i <= 2 * n; i++) {
            preSums[i] = preSums[i - 1] + stones[(i - 1) % n];
        }

        int[][] dp = new int[2 * n][2 * n];

        for (int i = 0; i < 2 * n; i++) {
            dp[i][i] = 0;
        }

        for (int len = 2; len <= 2 * n; len++) {
            for (int i = 0; i < 2 * n - len + 1; i++) {
                int j = i + len - 1;
                dp[i][j] = Integer.MAX_VALUE;

                for (int m = i; m < j; m++) {
                    dp[i][j] = Math.min(dp[i][j],
                            dp[i][m] + dp[m + 1][j]);
                }
                dp[i][j] += preSums[j + 1] - preSums[i];
            }
        }

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n; ++i) {
            if (dp[i][i + n - 1] < ans) {
                ans = dp[i][i + n - 1];
            }
        }
        return ans;
    }
}
