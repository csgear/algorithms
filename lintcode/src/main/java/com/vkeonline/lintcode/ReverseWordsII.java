package com.vkeonline.lintcode;

/**
 * Lintcode 927. Reverse Words in a String II
 */
public class ReverseWordsII {
    private void swap(char[] str, int left, int right) {
        for(int i = left ; i <= (left + right) / 2 ; i++) {
            char temp = str[i] ;
            str[i] = str[left + right - i] ;
            str[left + right - i] = temp ;
        }
    }

    public char[] reverseWords(char[] str) {
        int n = str.length, pre = 0;
        for (int i = 0; i <= n; ++i) {
            if (i == n || str[i] == ' ') {
                swap(str, pre, i - 1);
                pre = i + 1;
            }
        }
        swap(str, 0, n - 1);
        return str;
    }
}
