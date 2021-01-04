package com.vkeonline.lintcode.p000;

/**
 * Lint code: 79. Longest Common Substring
 *
 * @author csgear
 */
public class LongestCommonSubstring {
    public int longestCommonSubstring(String A, String B) {
        int m = A.length();
        int n = B.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (A.charAt(i - 1) == B.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
            }
        }
        int max = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                max = Math.max(max, dp[i][j]);
            }
        }
        return max;
    }
}
