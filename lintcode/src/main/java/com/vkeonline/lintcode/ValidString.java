package com.vkeonline.lintcode;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * LintCode: 1893. the Valid String
 */
public class ValidString {
    public String isValid(String s) {
        Map<Character, Integer> map = new HashMap<>() ;

        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1) ;
        }

        int diff = 0 ;
        int index = 0 ;
        int prev = Integer.MIN_VALUE ;
        // TODO: shall the map.values are sorted?
        for(int count: map.values()) {
            if(index != 0) {
                diff += Math.min(Math.abs(count - prev), count) ;
            }
            prev = count ;
            index++ ;
        }

        if(diff > 1) return  "NO" ;

        return "YES" ;
    }
}
