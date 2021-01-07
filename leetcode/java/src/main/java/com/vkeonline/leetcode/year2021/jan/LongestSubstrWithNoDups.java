package com.vkeonline.leetcode.year2021.jan;

import java.util.HashSet;
import java.util.Set;

/**
 * @author csgear
 */
public class LongestSubstrWithNoDups {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>() ;
        int max = 0 ;
        int i = 0, j = 0 ;

        while(i < s.length() && j < s.length()) {
            if( !set.contains(s.charAt(j))) {
                set.add(s.charAt(j)) ;
                max = Math.max(max, j-i + 1) ;
                j++ ;
            }
            else {
                set.remove(s.charAt(i)) ;
                i++ ;
            }
        }

        return max ;
    }
}
