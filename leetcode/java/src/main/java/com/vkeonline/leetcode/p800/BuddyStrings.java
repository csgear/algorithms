package com.vkeonline.leetcode.p800;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Leetcode [E]: 859. Buddy Strings
 * @author csgear
 * 
 */
public class BuddyStrings {
    public boolean buddyStrings(String aString, String bString) {
        if (aString.length() != bString.length()) {
            return false;
        }
        if (aString.equals(bString)) {
            Set<Character> s = new HashSet<>();
            for (char c : aString.toCharArray()) {
                s.add(c);
            }
            return s.size() < aString.length();
        }
        List<Integer> dif = new ArrayList<>();
        for (int i = 0; i < aString.length(); ++i) {
            if (aString.charAt(i) != bString.charAt(i)) {
                dif.add(i);
            }
        }
        return dif.size() == 2 && aString.charAt(dif.get(0)) == bString.charAt(dif.get(1)) && aString.charAt(dif.get(1)) == bString.charAt(dif.get(0));

    }
}
