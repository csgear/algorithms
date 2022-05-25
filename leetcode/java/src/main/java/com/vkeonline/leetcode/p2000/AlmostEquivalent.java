package com.vkeonline.leetcode.p2000;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Leetcode [E]: 2068. Check Whether Two Strings are Almost Equivalent
 *
 * @author csgear
 */
public class AlmostEquivalent {
    private static Map<String, Long> getMapOfCharacterFrequency(String input) {
        return Stream.of(input.split(""))
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
    }

    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] count = new int[26];

        for (int i = 0; i < word1.length(); i++) {
            count[word1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < word1.length(); i++) {
            count[word2.charAt(i) - 'a']--;
        }

        for (int j : count) {
            if (j > 3 || j < -3) {
                return false;
            }
        }

        return true;
    }

}
