package com.vkeonline.leetcode.year2020.april;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
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
