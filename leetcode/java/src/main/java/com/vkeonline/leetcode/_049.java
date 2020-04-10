package com.vkeonline.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class _049 {

    public static void main(String[] args) {
        Solution groupAnagrams49 = new _049().new Solution();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams49.groupAnagrams(strs));
    }

    public class Solution {
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
}
