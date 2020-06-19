package com.vkeonline.leetcode.june;

import java.util.HashSet;

/**
 * @author csgear
 */
public class LongestDupSubstring {
    public String longestDupSubstring(String S) {
        int low = 1;
        int high = S.length();
        while (low != high) {
            int middle = low + (high - low) >> 1;
            if (search(S, middle) != -1) {
                low = middle + 1;
            } else {
                high = middle;
            }
        }

        int start = search(S, low - 1);

        return start != -1 ? S.substring(start, start + low - 1) : "";

    }

    private int search(String S, int length) {
        long hash = 0;
        int a = 26;
        int n = S.length();

        long mod = 10000007;

        for (int i = 0; i < length; i++) {
            hash = (hash * a + (S.charAt(i) - 'a')) % mod;
        }

        HashSet<Long> set = new HashSet<>();

        set.add(hash);

        long global = 1;

        for (int i = 0; i < length; ++i) {
            global = (global * a) % mod;
        }

        for (int start = 1; start < n - length + 1; ++start) {
            hash = (hash * a - (S.charAt(start - 1) - 'a') * global % mod + mod) % mod;
            hash = (hash + (S.charAt(start + length - 1) - 'a')) % mod;
            if (set.contains(hash)) {
                return start;
            }
            set.add(hash);
        }
        return -1;
    }
}
