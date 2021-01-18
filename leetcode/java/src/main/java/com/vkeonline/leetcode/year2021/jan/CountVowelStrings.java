package com.vkeonline.leetcode.year2021.jan;

/**
 * @author csgear
 */
public class CountVowelStrings {
    int countVowelStrings(int n) {
        String[] vec = {"a", "e", "i", "o", "u"};
        return helper(vec, n, 0, "");
    }

    private int helper(String[] vec, int n, int i, String s) {
        if (n == 0) {
            return 1;
        }
        int ans = 0;
        for (int j = i; j < 5; j++) {
            ans += helper(vec, n - 1, j, s + vec[j]);
        }
        return ans;
    }

    int countVowelStringsDP(int n) {
        int[] dp = new int[5];

        for (int j = 0; j <= n; j++) {
            for (int i = 0; i < 5; i++) {
                if (j == 0) {
                    dp[i] = 1;
                } else {
                    if (i >= 1) {
                        dp[i] += dp[i - 1];
                    }
                }
            }
        }
        return dp[4];
    }
}
