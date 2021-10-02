////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// File: FindAllAnagrams.java
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Author: xiaoyang
//
// Nokia - Confidential
// Do not use, distribute, or copy without consent of Nokia.
// Copyright (c) 2021 Nokia. All rights reserved.
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package com.vkeonline.leetcode.p400;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Leetcode [M]: 438. Find All Anagrams in a String
 * @author csgear
 */
public class FindAllAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        int m = p.length(), n = s.length();
        List<Integer> result = new ArrayList<>();
        if (m > n) {
            return result;
        }

        int[] cntArray = new int[26];

        for (int i = 0; i < m; i++) {
            cntArray[s.charAt(i) - 'a']++;
            cntArray[p.charAt(i) - 'a']--;
        }

        for (int i = m; i < n; i++) {
            if (areAllZeroes(cntArray)) {
                result.add(i - m);
            }

            cntArray[s.charAt(i) - 'a']++;
            cntArray[s.charAt(i - m) - 'a']--;
        }

        if (areAllZeroes(cntArray)) {
            result.add(n - m);
        }

        return result;
    }

    boolean areAllZeroes(int[] counters) {
        return Arrays.stream(counters).allMatch(n -> n == 0);
    }
}
