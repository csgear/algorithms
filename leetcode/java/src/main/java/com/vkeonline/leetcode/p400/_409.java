package com.vkeonline.leetcode.p400;

public class _409 {
    class Solution {
        public int longestPalindrome(String s) {
            int res = 0, odd = 0;
            int[] cnt = new int[128] ;

            for(char c: s.toCharArray()) {
                cnt[c] ++ ;
            }

            for(int c: cnt) {
                res = res + c ;
                if(c % 2 != 0) {
                    res -= 1 ;
                    odd += 1 ;
                }
            }

            return odd > 0 ? res + 1 : res ;
        }
    }
}
