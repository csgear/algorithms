package com.vkeonline.lintcode.p000;

/**
 * Lint code: 55 Compare Strings
 * @author csgear
 */
public class CompareStrings {
    /**
     * @param A: A string
     * @param B: A string
     * @return if string A contains all of the characters in B return true else return false
     */
    public boolean compareStrings(String A, String B) {
        int[] count = new int[256] ;

        for(char c: A.toCharArray()) {
            count[c]++ ;
        }

        for(char c: B.toCharArray()) {
            count[c]-- ;
            if(count[c] < 0) {
                return  false ;
            }
        }

        return true ;
    }
}
