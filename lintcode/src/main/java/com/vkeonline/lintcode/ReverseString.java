package com.vkeonline.lintcode;


import java.util.Arrays;
import java.util.Collections;

/**
 * LintCode. 1283. Reverse String
 */
public class ReverseString {
    public String reverseString(String s) {
        StringBuilder sb = new StringBuilder(s) ;
        sb.reverse() ;
        
        return sb.toString() ;
    }
}
