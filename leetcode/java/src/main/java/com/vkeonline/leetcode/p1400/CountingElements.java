package com.vkeonline.leetcode.p1400;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Leetcode [E]: 1426. Count Elements
 * @author csgear
 */
public class CountingElements {
    public int countElements(int[] arr) {

        Set<Integer> set = IntStream.of(arr).boxed().collect(Collectors.toSet());

        int result = 0 ;

        for(int num: arr) {
            if(set.contains(num + 1)) {
                result += 1 ;
            }
        }

        return result ;
    }
}
