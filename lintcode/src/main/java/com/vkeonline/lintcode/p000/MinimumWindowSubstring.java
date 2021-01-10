package com.vkeonline.lintcode.p000;

import java.util.HashMap;
import java.util.Map;

/**
 * Lint code: 32. Minimum Window Substring
 *
 * @author csgear
 */
public class MinimumWindowSubstring {
    /**
     * @param source  : A string
     * @param target: A string
     * @return A string denote the minimum window, return "" if there is no such a string
     */
    public String minWindow(String source, String target) {

        Map<Character, Integer> dictT = new HashMap<>();

        for (Character c : target.toCharArray()) {
            int count = dictT.getOrDefault(c, 0);
            dictT.put(c, count + 1);
        }

        int required = dictT.size();

        int l = 0, r = 0;

        int formed = 0;

        Map<Character, Integer> windowCounts = new HashMap<>();

        int len = -1, start = 0, end = 0;

        while (r < source.length()) {
            char c = source.charAt(r);
            int count = windowCounts.getOrDefault(c, 0);
            windowCounts.put(c, count + 1);

            if (dictT.containsKey(c) && windowCounts.get(c).intValue() == dictT.get(c).intValue()) {
                formed++;
            }

            while (l <= r && formed == required) {
                c = source.charAt(l);
                if (len == -1 || r - l + 1 < len) {
                    len = r - l + 1;
                    start = l;
                    end = r;
                }

                windowCounts.put(c, windowCounts.get(c) - 1);
                if (dictT.containsKey(c) && windowCounts.get(c).intValue() < dictT.get(c).intValue()) {
                    formed--;
                }
                l++;
            }

            r++;
        }

        return len == -1 ? "" : source.substring(start, end + 1);
    }
}
