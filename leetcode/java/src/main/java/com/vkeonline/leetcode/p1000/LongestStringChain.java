package com.vkeonline.leetcode.p1000;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode [M]: 1048. Longest String Chain
 *
 * @author csgear
 */
public class LongestStringChain {
    public int longestStrChain(String[] words) {
        Arrays.sort(words, Comparator.comparingInt(String::length));
        Map<String, Integer> cnt = new HashMap<>();
        int ans = 0;
        for (String word : words) {
            int best = 0;
            for (int i = 0; i < word.length(); i++) {
                String predecessor = word.substring(0, i) + word.substring(i + 1);
                best = Math.max(best, cnt.getOrDefault(predecessor, 0) + 1);
            }
            cnt.put(word, best);
            ans = Math.max(ans, best);
        }
        return ans;
    }
}
