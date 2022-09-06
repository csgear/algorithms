package com.vkeonline.leetcode.p300;

/**
 * Leetcode [M]: 318. Maximum Product of Word Lengths
 * @author csgear
 */
public class MaximumProductWordLengths {
    public int maxProduct(String[] words) {
        int n = words.length ;
        int[] lens = new int[n] ;
        int[] bitmasks = new int[n] ;
        for (int i = 0; i < n ; i++) {
            lens[i] = words[i].length() ;
            for (char ch : words[i].toCharArray()) {
                bitmasks[i] |= 1 <<  (ch - 'a') ;
            }
        }
        int maxVal = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if ((bitmasks[i] & bitmasks[j]) == 0) {
                    maxVal = Math.max(maxVal, lens[i] * lens[j]);
                }
            }
        }

        return maxVal;
    }
}
