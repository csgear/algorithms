package com.vkeonline.lintcode.p100;

import java.util.*;

/**
 * Lint code: 171: Anagrams
 *
 * @author csgear
 */
public class Anagrams {
    /**
     * @param strs: A list of strings
     * @return A list of strings
     */
    public List<String> anagrams(String[] strs) {
        List<String> results = new ArrayList<>();

        if(strs == null || strs.length == 0) {
            return  results ;
        }

        Map<String, List<String>> map = new HashMap<>() ;
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String key = String.valueOf(charArray);
            map.computeIfAbsent(key, s -> map.put(s, new ArrayList<>()));
            map.get(key).add(str);
        }

        for(Map.Entry<String, List<String>> entry: map.entrySet()) {
            if(entry.getValue().size() > 1) {
                results.addAll(entry.getValue()) ;
            }
        }
        return results;
    }
}
