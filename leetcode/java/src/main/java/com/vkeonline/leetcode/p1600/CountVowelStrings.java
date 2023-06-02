package com.vkeonline.leetcode.p1600;

import java.util.Arrays;

/**
 * Leetcode [M]: 1641. Count Sorted Vowel Strings
 * @author csgear
 */
public class CountVowelStrings {

    public int countVowelStrings(int n) {
        int[] dp = new int[5];
        Arrays.fill(dp, 1);
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < 5; j++) {
                dp[j] += dp[j - 1];
            }
        }
        return Arrays.stream(dp).sum();
    }
}
