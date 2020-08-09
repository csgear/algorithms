package com.vkeonline.leetcode.may;

import java.util.Arrays;

/**
 * Permutation in String
 */
public class PermutationString {
    public boolean checkInclusion(String p, String s) {
        int m = p.length(), n = s.length();

        if (m > n) return false;

        int[] cntArray = new int[26];

        for (int i = 0; i < m; i++) {
            cntArray[s.charAt(i) - 'a']++;
            cntArray[p.charAt(i) - 'a']--;
        }

        for (int i = m; i < n; i++) {
            if (areAllZeroes(cntArray)) {
                return true;
            }
            cntArray[s.charAt(i) - 'a']++;
            cntArray[s.charAt(i - m) - 'a']--;
        }

        return areAllZeroes(cntArray);
    }

    boolean areAllZeroes(int[] counters) {
        return Arrays.stream(counters).allMatch(n -> n == 0);

    }
}
