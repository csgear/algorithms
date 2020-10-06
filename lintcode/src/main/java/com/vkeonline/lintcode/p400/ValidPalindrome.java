package com.vkeonline.lintcode.p400;

/**
 * @author csgear
 * Lintcode: 415. Valid Palindrome
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if(s == null || s.length() == 0) {
            return true ;
        }

        char[] chars = s.toCharArray() ;
        int i = 0, j = chars.length - 1 ;
        boolean result = true ;

        while(i < j) {
            while( i < s.length() && !isValid(chars[i])) {
                i++ ;
            }

            if(i == chars.length) {
                break ;
            }

            while(j >= 0 && !isValid(chars[j])) {
                j-- ;
            }

            if(Character.toLowerCase(chars[i])  != Character.toLowerCase(chars[j])) {
                result = false ;
                break ;
            }

            i++ ; j-- ;
        }

        return result ;
    }

    private boolean isValid(char c) {
        return Character.isLetter(c) || Character.isDigit(c) ;
    }
}
