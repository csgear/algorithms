package com.vkeonline.leetcode.may;

import java.util.PriorityQueue;

public class SortCharactersFrequency {
    public String frequencySort(String s) {
        if(s == null || s.length() == 0)  return s ;
        int[] cnt = new int[256] ;
        for(char c : s.toCharArray()) {
            cnt[c]++ ;
        }

        PriorityQueue<Character> pq = new PriorityQueue<>((a,b) -> cnt[b] - cnt[a]) ;

        for(int i = 0 ; i < 256 ; i++)  pq.offer((char)i) ;

        StringBuilder sb = new StringBuilder() ;

        while (!pq.isEmpty()) {
            Character c = pq.poll() ;
            for(int i = 0 ; i < cnt[c] ; i++) {
                sb.append(c) ;
            }
        }

        return sb.toString() ;
    }
}
