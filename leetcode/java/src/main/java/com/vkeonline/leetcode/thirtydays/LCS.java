package com.vkeonline.leetcode.thirtydays;

public class LCS {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();

        if (text1 == null || text2 == null || m == 0 || n == 0)
            return 0;

        // Creating Table.
        int[][] lcs = new int[m + 1][n + 1];

        // Dynamic Programming
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1))
                    lcs[i][j] = 1 + lcs[i - 1][j - 1];  // equals means we add 1  with diagonal element
                else
                    lcs[i][j] = Math.max(lcs[i - 1][j], lcs[i][j - 1]); // or we have to take max with right element and top element
            }
        }
        return lcs[m][n];

    }
}
