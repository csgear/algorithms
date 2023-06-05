
package com.vkeonline.leetcode.p1500;

import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode [H]: 1542. Find Longest Awesome Substring
 * @author csgear
 */
public class LongestAwesomeString {
    public int longestAwesome(String s) {
        int n = s.length();
        // (status, i) map that stores status for every position i
        Map<Integer, Integer> prefix = new HashMap<>();
        prefix.put(0, -1);
        int ans = 0;
        int status = 0;
        for (int j = 0; j < n; ++j) {
            int digit = s.charAt(j) - '0';
            status ^= (1 << digit);
            if (prefix.containsKey(status)) {
                ans = Math.max(ans, j - prefix.get(status));
            } else {
                prefix.put(status, j);
            }
            // include jth and flip another bit
            for (int k = 0; k < 10; ++k) {
                if (prefix.containsKey(status ^ (1 << k))) {
                    ans = Math.max(ans, j - prefix.get(status ^ (1 << k)));
                }
            }
        }
        return ans;

    }
}
