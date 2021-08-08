
package com.vkeonline.leetcode.p100;

/**
 * Leetcode [M]: 186. Reverse Words in a String II
 * @author csgear
 */
public class ReverseWordsStringII {
    private void reverse(char[] s, int left, int right) {
        while (left < right) {
            char tmp = s[left];
            s[left++] = s[right];
            s[right--] = tmp;
        }
    }

    private void reverseEachWord(char[] s) {
        int n = s.length;
        int start = 0, end = 0;

        while (start < n) {
            // go to the end of the word
            while (end < n && s[end] != ' ') {
                ++end;
            }
            reverse(s, start, end - 1);
            start = end + 1;
            ++end;
        }
    }

    public void reverseWords(char[] s) {
        reverse(s, 0, s.length - 1);
        reverseEachWord(s);
    }
}
