package com.vkeonline.leetcode.p100;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _140 {
    public class Solution {
        public ArrayList<String> wordBreak(String s, Set<String> dict) {
            // Note: The Solution object is instantiated only once and is reused by each test case.
            Map<String, ArrayList<String>> memo = new HashMap<>();
            return wordBreakHelper(s, dict, memo);
        }

        private ArrayList<String> wordBreakHelper(String s,
                                                  Set<String> dict,
                                                  Map<String, ArrayList<String>> memo) {
            if (memo.containsKey(s)) {
                return memo.get(s);
            }

            ArrayList<String> results = new ArrayList<>();

            if (s.length() == 0) {
                return results;
            }

            if (dict.contains(s)) {
                results.add(s);
            }

            for (int len = 1; len < s.length(); ++len) {
                String word = s.substring(0, len);
                if (! dict.contains(word)) {
                    continue;
                }

                String suffix = s.substring(len);

                ArrayList<String> segments = wordBreakHelper(suffix, dict, memo);

                for (String segement : segments) {
                    results.add(word + " " + segement);
                }
            }

            memo.put(s, results);

            return results;
        }
    }
}
