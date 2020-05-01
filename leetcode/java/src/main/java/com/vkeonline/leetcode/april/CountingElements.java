package com.vkeonline.leetcode.april;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountingElements {
    public int countElements(int[] arr) {
//        Set<Integer> set = new HashSet<>() ;
//        for(int num: arr)  set.add(num) ;

        Set<Integer> set = IntStream.of(arr).boxed().collect(Collectors.toSet());

        int result = 0 ;

        for(int num: arr) {
            if(set.contains(num + 1)) result += 1 ;
        }

        return result ;
    }
}
