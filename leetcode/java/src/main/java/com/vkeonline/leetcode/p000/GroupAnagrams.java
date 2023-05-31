package com.vkeonline.leetcode.p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Leetcode [M]: 49. Group Anagrams
 * @author csgear
 */

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] arr = s.toLowerCase().toCharArray();
            Arrays.sort(arr);
            String current = String.valueOf(arr);
            if (map.containsKey(current)) {
                List<String> list = map.get(current);
                list.add(s);
            } else {
                List<String> list = new ArrayList<String>();
                list.add((s));
                map.put(current, list);
            }
        }

        List<List<String>> result = new ArrayList<>(map.size());

        result.addAll(map.values());

        return result;
    }
}

