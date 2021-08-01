
package com.vkeonline.leetcode.p1300;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/**
 * Leetcode [M]: 1338. Reduce Array Size to The Half
 * @author csgear
 */
public class ReduceArraySize {
    public int minSetSize(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>() ;
        for(int num: arr) {
            map.put(num, map.getOrDefault(num, 0) + 1) ;
        }

        List<Integer> freqs = map.values().stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()) ;

        int count = 0 ;
        int result = 0 ;
        for(int freq: freqs) {
            result += 1 ;
            count += freq ;
            if(count * 2 >= arr.length) {
                break ;
            }
        }
        return result ;
    }

}
