package com.vkeonline.leetcode.p700;

public class _712 {
    class Solution {
        public int minimumDeleteSum(String s1, String s2) {
            int m = s1.length();
            int n = s2.length();
            int[][] f = new int[m + 1][n + 1];
            for (int i = 1; i <= m; i ++) {
                f[i][0] = f[i - 1][0] + (int)s1.charAt(i - 1);
            }
            for (int j = 1; j <= n; j ++) {
                f[0][j] = f[0][j - 1] + (int)s2.charAt(j - 1);
            }
            for (int i = 1; i <= m; i ++) {
                for (int j = 1; j <= n; j ++) {
                    f[i][j] = Math.min(f[i - 1][j] + (int)s1.charAt(i - 1), f[i][j - 1] + (int)s2.charAt(j - 1));
                    if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                        f[i][j] = Math.min(f[i][j], f[i - 1][j - 1]);
                    }
                }
            }
            return f[m][n];
        }
    }
}
