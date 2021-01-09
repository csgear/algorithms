package com.vkeonline.leetcode.year2020.oct;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class CombinationSumTest {

    @Test
    void testDistinctOperation() {
        int[] candidates = {2,2, 3,6,7} ;

        int[] result = Arrays.stream(candidates).sorted().distinct().toArray() ;

        System.out.println(Arrays.toString(candidates)) ;
        System.out.println(Arrays.toString(result));
    }

    @Test
    void combinationSum() {

    }
}