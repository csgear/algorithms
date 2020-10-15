package com.vkeonline.lintcode.p100;

import java.util.HashSet;
import java.util.Set;

/**
 * LintCode: 124. Longest Consecutive Sequence
 * @author csgear
 */
public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] num) {
        Set<Integer> set = new HashSet<>() ;

        for(int n: num) set.add(n) ;

        int longest = 0 ;

        for(int i = 0 ; i < num.length ; i++) {
            int down = num[i] -  1 ;
            while(set.contains(down)) {
                set.remove(down) ;
                down-- ;
            }
            int up = num[i] + 1 ;
            while(set.contains(up)) {
                set.remove(up) ;
                up++ ;
            }

            longest = Math.max(longest, up - down - 1 ) ;
        }

        return longest ;
    }
}
