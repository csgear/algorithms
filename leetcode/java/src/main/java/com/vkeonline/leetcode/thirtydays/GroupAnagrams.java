package com.vkeonline.leetcode.thirtydays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>() ;
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str: strs) {
            char[] letters = str.toCharArray() ;
            Arrays.sort(letters) ;
            String newStr = new String(letters) ;
            if(map.containsKey(newStr)) {
                map.get(newStr).add(str) ;
            }
            else {
                List<String> words = new ArrayList<>() ;
                words.add(str) ;
                map.put(newStr, words) ;
            }
        }

        for(String s: map.keySet()) {
            result.add(map.get(s)) ;
        }

        return result ;
    }
}
