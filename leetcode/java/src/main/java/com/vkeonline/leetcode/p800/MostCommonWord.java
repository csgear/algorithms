package com.vkeonline.leetcode.p800;

import java.util.*;

/**
 * Leetcode [E]: 819. Most Common Word
 *
 * @author csgear
 */
public class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> set = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> map = new HashMap<>();

        String[] words = paragraph.replaceAll("\\p{Punct}", " ").trim()
                .toLowerCase().split("\\s+");

        for (String word : words) {
            if (!set.contains(word))
                map.put(word, map.getOrDefault(word, 0) + 1);
        }
        return map.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
    }
}
