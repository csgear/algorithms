package com.vkeonline.lintcode.p600;

import java.util.HashSet;
import java.util.Set;

/**
 * Lint code: 683. Word Break III
 *
 * @author csgear
 */
public class WordBreak3 {
    /**
     * @param s : string
     * @param dict: set of word
     * @return the number of possible sentences.
     */
    public int wordBreak3Dp(String s, Set<String> dict) {
        if (s == null || "".equals(s)) {
            return 0;
        }

        Set<String> lowerDict = new HashSet<>();
        for (String c : dict) {
            lowerDict.add(c.toLowerCase());
        }
        dict = lowerDict;
        s = s.toLowerCase();

        int[] dp = new int[s.length() + 1];
        dp[0] = 1;


        for (int i = 1; i <= s.length(); i++) {
            for (int k = 0; k < i; k++) {
                dp[i] += dp[k] * (dict.contains(s.substring(k, i)) ? 1 : 0);
            }
        }
        return dp[s.length()];
    }

    public int wordBreak3DP2(String s, Set<String> dict) {
        s = s.toLowerCase();
        int res = 0;
        int n = s.length();
        int[][] dp = new int[n][n];
        Set<String> lowerDict = new HashSet<>();

        for (String word : dict) {
            lowerDict.add(word.toLowerCase());
        }

        for (int end = 0; end < n; end++) {
            for (int start = end; start >= 0; start--) {
                if (lowerDict.contains(s.substring(start, end + 1))) {
                    dp[start][end]++;
                }
            }
        }

        for (int end = 0; end < n; end++) {
            for (int mid = end - 1; mid >= 0; mid--) {
                dp[0][end] += dp[0][mid] * dp[mid + 1][end];
            }
        }

        return dp[0][n - 1];
    }
}
