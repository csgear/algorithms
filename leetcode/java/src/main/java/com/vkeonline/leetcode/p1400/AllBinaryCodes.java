package com.vkeonline.leetcode.p1400;

import java.util.HashSet;
import java.util.Set;

/**
 * @author csgear
 * 1461. Check If a String Contains All Binary Codes of Size K
 */
public class AllBinaryCodes {
    public boolean hasAllCodes(String s, int k) {
        if ((s.length() - k + 1) * k <= (1 << k)) {
            return false;
        }

        Set<String> set = new HashSet<>();

        for (int i = 0; i + k <= s.length(); ++i) {
            set.add(s.substring(i, i + k));
        }

        return set.size() == (1 << k);
    }
}
