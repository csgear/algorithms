package com.vkeonline.lintcode;

import java.util.*;

public class _0500 {
    public class TopK {
        private Map<String, Integer> map ;
        private NavigableSet<String> set ;
        private int k ;

        /*
         * @param k: An integer
         */public TopK(int k) {
            // do initialization if necessary
            this.k = k ;
            map = new HashMap<>() ;
            set = new TreeSet<>((o1, o2) -> {
                int left = map.get(o1) ;
                int right = map.get(o2) ;
                if(left == right) {
                    return  o1.compareTo(o2) ;
                }
                else {
                    return right - left ;
                }
            }) ;
        }

        /*
         * @param word: A string
         * @return: nothing
         */
        public void add(String word) {
            // write your code here
            if(map.containsKey(word)) {
                set.remove(word) ;
                map.put(word, map.get(word) + 1) ;
            }
            set.add(word) ;
            if(set.size() > k) {
                set.pollLast() ;
            }
        }

        /*
         * @return: the current top k frequent words.
         */
        public List<String> topk() {
            // write your code here
            ArrayList<String> result = new ArrayList<>(set);
            return result ;
        }
    }
}
