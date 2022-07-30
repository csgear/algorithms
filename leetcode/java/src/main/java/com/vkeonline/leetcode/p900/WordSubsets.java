package com.vkeonline.leetcode.p900;

import java.util.ArrayList;
import java.util.List;

/**
 * Leetcode [M]: 916. Word Subsets
 *
 * @author csgear
 */
public class WordSubsets {
    public List<String> wordSubsets(String[] A, String[] B) {
        int[] uni = new int[26], x;
        int i;
        for (String b : B) {
            x = counter(b);
            for (i = 0; i < 26; ++i) {
                uni[i] = Math.max(uni[i], x[i]);
            }
        }
        List<String> uni2 = new ArrayList<>();
        for (String a : A) {
            x = counter(a);
            for (i = 0; i < 26; ++i) {
                if (x[i] < uni[i]) {
                    break;
                }
            }
            if (i == 26) {
                uni2.add(a);
            }
        }
        return uni2;
    }

    private int[] counter(String word) {
        int[] count = new int[26];
        for (char c : word.toCharArray()) {
            count[c - 'a']++;
        }
        return count;
    }
}

