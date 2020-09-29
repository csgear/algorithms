package com.vkeonline.lintcode.p1200;


/**
 * LintCode. 1283. Reverse String
 * @author csgear
 */
public class ReverseString {
    public String reverseString(String s) {
        StringBuilder sb = new StringBuilder(s) ;
        sb.reverse() ;
        
        return sb.toString() ;
    }
}
