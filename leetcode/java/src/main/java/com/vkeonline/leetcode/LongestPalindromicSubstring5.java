package com.vkeonline.leetcode;

public class LongestPalindromicSubstring5 {
    public static void main(String[] args) {
        LongestPalindromicSubstring5 longestPalindromicSubstring5 = new LongestPalindromicSubstring5() ;
        String s = "abccba" ;
        System.out.println(longestPalindromicSubstring5.longestPalindrome(s));
    }

    public String longestPalindrome(String s) {
        if(s == null || s.length() == 0) return s ;

        int n = s.length() ;

        boolean[][] isPalindrome = new boolean[n][n] ;

        int left = 0, right = 0 ;

        for(int j = 1 ; j < s.length() ; j++ )
        {
            for(int i = 0 ; i < j ; i++) {
                boolean isInnerWordPalindrome = isPalindrome[i+1][j-1] || j - i <= 2 ;

                if( (s.charAt(i) == s.charAt(j)) && isInnerWordPalindrome) {
                    isPalindrome[i][j] = true ;
                    if(j - i > right - left) {
                        left = i ;
                        right = j ;
                    }
                }
            }
        }

        return s.substring(left, right + 1 ) ;

    }
}
