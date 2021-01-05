package com.vkeonline.lintcode.p400;

/**
 * Lint code: 440. Backpack III
 *
 * @author csgear
 */
public class Backpack3 {
    /**
     * @param A: an integer array
     * @param V: an integer array
     * @param m: An integer
     * @return an array
     */
    public int backPackIII(int[] A, int[] V, int m) {
        // write your code here

        int n = A.length;
        int[] dp = new int[m + 1];

        for (int i = 0; i < n; i++) {
            for (int j = A[i]; j <= m; j++) {
                dp[j] = Math.max(dp[j], dp[j - A[i]] + V[i]);
            }
        }

        return dp[m];
    }
}
