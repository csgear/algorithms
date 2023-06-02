

package com.vkeonline.leetcode.p2500;

/**
 * Leetcode [M]: 2559. Count Vowel Strings in Ranges
 * @author xiaojun.yang
 */
public class CountVowelStringsRanges {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] prefixSums = new int[words.length + 1] ;
        for (int i = 0; i < words.length; i++) {
            int value = isVowelString(words[i]) ? 1 : 0;
            prefixSums[i + 1] = prefixSums[i] + value ;
        }
        int q = queries.length;
        int[] ans = new int[q];
        for (int i = 0; i < q; i++) {
            int start = queries[i][0] ;
            int end = queries[i][1];
            ans[i] = prefixSums[end + 1] - prefixSums[start];
        }
        return ans ;
    }

    private boolean isVowelString(String word) {
        return isVowelLetter(word.charAt(0)) && isVowelLetter(word.charAt(word.length() - 1));
    }

    private boolean isVowelLetter(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

}
