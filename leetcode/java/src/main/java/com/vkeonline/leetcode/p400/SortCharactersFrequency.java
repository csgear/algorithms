package com.vkeonline.leetcode.p400;

import java.util.PriorityQueue;

/**
 * Leetcode [M]: 451. Sort Characters By Frequency
 * @author csgear
 */
public class SortCharactersFrequency {
    public String frequencySort(String s) {
        if(s == null || s.length() == 0)  {
            return s ;
        }
        int[] cnt = new int[256] ;
        for(char c : s.toCharArray()) {
            cnt[c]++ ;
        }

        PriorityQueue<Character> pq = new PriorityQueue<>((a,b) -> cnt[b] - cnt[a]) ;

        for(int i = 0 ; i < 256 ; i++)  {
            pq.offer((char)i) ;
        }

        StringBuilder sb = new StringBuilder() ;

        while (!pq.isEmpty()) {
            Character c = pq.poll() ;
            sb.append(String.valueOf(c).repeat(Math.max(0, cnt[c]))) ;
        }

        return sb.toString() ;
    }
}
