package com.vkeonline.leetcode.year2020.sept;

/**
 * @author csgear
 */
public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        return (s + s).substring(1, 2 * s.length() - 1).contains(s);
    }
}
