package com.vkeonline.lintcode.p1200;

import java.util.HashMap;
import java.util.Map;

/**
 * Lintcode 1246. Longest Repeating Character Replacement
 *
 * @author csgear
 */
public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int start = 0, end, maxLength = 0, maxFreq = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (end = 0; end < s.length(); end++) {
            char right = s.charAt(end);
            map.put(right, map.getOrDefault(right, 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(right));

            if (end - start + 1 - maxFreq > k) {
                char left = s.charAt(start);
                map.put(left, map.getOrDefault(left, 0) - 1);
                start++;
            }

            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }
}
