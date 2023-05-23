/*
 * Copyright (c) 2023 HyTrust Inc. All rights reserved.
 */

package com.vkeonline.leetcode.contest;

/**
 * @author xiaojun.yang
 */
public class SmallestPalindrome {
    public String makeSmallestPalindrome(String input) {
        char[] s = input.toCharArray() ;
        int l = 0, r = s.length - 1;
        while(l < r){
            if(s[l] < s[r]){
                s[r] = s[l];
            }else if(s[l] > s[r]){
                s[l] = s[r];
            }
            l++ ;
            r-- ;
        }
        return String.valueOf(s);
    }
}
