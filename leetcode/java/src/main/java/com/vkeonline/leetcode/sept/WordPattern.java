package com.vkeonline.leetcode.sept;

import java.util.HashMap;
import java.util.Map;

/**
 * @author csgear
 */
public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }
        Map<String, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (map1.put(words[i], i) != map2.put(pattern.charAt(i), i)) {
                return false;
            }
        }
        return true;
    }
}
