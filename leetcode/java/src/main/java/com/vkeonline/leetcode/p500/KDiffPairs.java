package com.vkeonline.leetcode.p500;

import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode [M]: 532. K-diff Pairs in an Array
 * @author csgear
 */
public class KDiffPairs {
    public int findPairs(int[] nums, int k) {
        int result = 0 ;

        Map<Integer, Integer> counter = new HashMap<>() ;

        for(int num: nums) {
            counter.put(num, counter.getOrDefault(num, 0) + 1) ;
        }

        for(int num: counter.keySet()) {
            if( (k > 0 && counter.containsKey(num + k)) || (k == 0 && counter.get(num) >= 2)) {
                result += 1 ;
            }
        }
        return result ;
    }
}
