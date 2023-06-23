package com.vkeonline.leetcode.p100;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Leetcode [M]: 187. Repeated DNA Sequences
 * @author csgear
 */
public class RepeatedDnaSeq {
    public List<String> findRepeatedDnaSequences(String s) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length() - 9; i++) {
            String sub = s.substring(i, i + 10);
            map.put(sub, map.getOrDefault(sub, 0) + 1);
        }

        return map.entrySet().stream().filter(e -> e.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
    }
}
