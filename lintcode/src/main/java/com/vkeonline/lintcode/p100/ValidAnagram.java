package com.vkeonline.lintcode.p100;

import java.util.Arrays;
import java.util.Locale;

/**
 * Lint code: 158 Valid Anagram
 * @author csgear
 */
public class ValidAnagram {
    /**
     * @param s: The first string
     * @param t: The second string
     * @return true or false
     */
    public boolean anagram(String s, String t) {
        int[] source = new int[256] ;

        for(char c: s.toCharArray()) {
            source[c]++ ;
        }

        for(char c: t.toCharArray()) {
            source[c]-- ;
        }

        return Arrays.stream(source).allMatch( num -> num == 0) ;
    }
}
