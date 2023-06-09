

package com.vkeonline.leetcode.p800;

/**
 * Leetcode [M]: 809. Expressive Words
 * @author csgear
 */
public class ExpressiveWord {
    public int expressiveWords(String s, String[] words) {
        int result = 0 ;
        for(String word: words) {
            if(stretchy(s, word)) {
                result += 1 ;
            }
        }
        return result ;
    }

    private boolean stretchy(String s, String word) {
        int i = 0 , j = 0 ;
        while(i < s.length() && j < word.length()) {
            if(s.charAt(i) != word.charAt(j)) {
                return false ;
            }
            char ch = s.charAt(i) ;
            int cnti = 0, cntj = 0 ;
            while(i < s.length() && s.charAt(i) == ch) {
                cnti++ ;
                i++ ;
            }
            while (j < word.length() && word.charAt(j) == ch) {
                cntj++ ;
                j++ ;
            }

            if(cnti < cntj) {
                return  false ;
            }
            if(cnti != cntj && cnti < 3) {
                return  false ;
            }
        }
        return i == s.length() && j == word.length() ;
    }
}
