package com.vkeonline.lintcode.p200;

/**
 * Lintcode: 200. Longest Palindromic Substring
 * @author csgear
 */
public class LongestPalindrome {
    /**
     * @param s: input string
     * @return: the longest palindromic substring
     */
    public String longestPalindrome(String s) {
        // write your code here

        if (s == null || s.length() == 0) {
            return "";
        }

        int longest = 0;
        int len = 0;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            len = findLongest(s, i, i);

            if (len > longest) {
                longest = len;
                start = i - len / 2;
            }

            len = findLongest(s, i, i + 1);

            if (len > longest) {
                longest = len;
                start = i - len / 2 + 1;
            }
        }

        return s.substring(start, start + longest);

    }

    private int findLongest(String s, int start, int end) {
        int len = 0;

        while (start >= 0 && end < s.length()) {
            if (s.charAt(start) != s.charAt(end)) break;
            len += start == end ? 1 : 2;
            start--;
            end++;
        }

        return len;
    }
}

