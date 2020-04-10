package com.vkeonline.leetcode;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _139 {
    class Solution {
        private int getMaxLength(Set<String> dict) {
            int maxLength = 0;
            for (String word : dict) {
                maxLength = Math.max(maxLength, word.length());
            }
            return maxLength;
        }

        public boolean wordBreak(String s, List<String> wordDict) {

            Set<String> dict = new HashSet<>(wordDict);

            if (s == null || s.length() == 0) {
                return true;
            }

            int maxLength = getMaxLength(dict);
            boolean[] canSegment = new boolean[s.length() + 1];

            canSegment[0] = true;
            for (int i = 1; i <= s.length(); i++) {
                canSegment[i] = false;
                for (int lastWordLength = 1;
                     lastWordLength <= maxLength && lastWordLength <= i;
                     lastWordLength++) {
                    if (!canSegment[i - lastWordLength]) {
                        continue;
                    }
                    String word = s.substring(i - lastWordLength, i);
                    if (dict.contains(word)) {
                        canSegment[i] = true;
                        break;
                    }
                }
            }

            return canSegment[s.length()];
        }
    }

    class Solution1 {
        public boolean wordBreakHelper(String s, int start, List<String> wordDict, int[] dp) {
            if (start > s.length()) return false;

            if (start == s.length()) return true;

            if (dp[start] != -1) return dp[start] != 0;

            for (String word : wordDict) {
                if (s.startsWith(word, start) &&
                        wordBreakHelper(s, start + word.length(), wordDict, dp))
                    return true;
            }
            dp[start] = 0;
            return false;
        }

        public boolean wordBreak(String s, List<String> wordDict) {
            int[] dp = new int[s.length() + 1];
            Arrays.fill(dp, -1);
            return wordBreakHelper(s, 0, wordDict, dp);
        }

    }

}
