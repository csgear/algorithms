package com.vkeonline.leetcode.p900;

import java.util.ArrayList;
import java.util.List;

/**
 * Leetcode: 906. Super Palindromes
 * @author csgear
 */
public class SuperPalindromes {
    public int superpalindromesInRange(String left, String right) {
        long leftBound = Long.parseLong(left) ;
        long rightBound = Long.parseLong(right) ;
        List<Long> palindromes = new ArrayList<>() ;

        for (int i = 1 ; i < 10; i++) {
            palindromes.add((long) i) ;
        }
        final long upper = 10000 ;
        for(long i = 1 ; i <= upper ; i++) {
            String leftPart = String.valueOf(i) ;
            StringBuilder rightPart = new StringBuilder(leftPart).reverse() ;
            palindromes.add(Long.valueOf(leftPart + rightPart)) ;
            for (int j = 0; j < 10 ; j++) {
                palindromes.add(Long.parseLong(leftPart+j+rightPart));
            }
        }

        int count = 0 ;
        for(Long p: palindromes) {
            long square=p*p;
            if(square >= leftBound && square <= rightBound && isPalindrome(square)) {
                count++ ;
            }
        }
        return count ;
    }

    private boolean isPalindrome(Long square) {
        String number = square.toString() ;
        int start = 0, end = number.length() - 1 ;
        while (start < end) {
            if(number.charAt(start) != number.charAt(end)) {
                return false ;
            }
            start++ ;
            end-- ;
        }

        return true ;
    }
}
