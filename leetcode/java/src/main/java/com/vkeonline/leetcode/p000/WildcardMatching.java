package com.vkeonline.leetcode.p000;

/**
 * Leetcode [H]: 44. Wildcard Matching
 *
 * @author csgear
 */
public class WildcardMatching {
    public boolean isMatch(String s, String p) {
        if (s == null && p == null) {
            return true;
        }
        if (s == null || p == null) {
            return false;
        }

        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        for (int i = 0; i <= s.length(); i++) {
            for (int j = 0; j <= p.length(); j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = true;
                } else if (j == 0) {
                    dp[i][j] = false;
                } else if (i == 0) {
                    if (p.charAt(j - 1) == '*') {
                        dp[i][j] = dp[i][j - 1];
                    } else {
                        dp[i][j] = false;
                    }
                } else {
                    if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '?') {
                        dp[i][j] = dp[i - 1][j - 1];
                    } else if (p.charAt(j - 1) == '*') {
                        dp[i][j] = dp[i][j - 1] || dp[i - 1][j];
                    } else {
                        dp[i][j] = false;
                    }
                }
            }
        }
        return dp[s.length()][p.length()];
    }
}
