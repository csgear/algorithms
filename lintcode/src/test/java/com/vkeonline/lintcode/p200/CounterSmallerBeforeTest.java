package com.vkeonline.lintcode.p200;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;


class CounterSmallerBeforeTest {
    CounterSmallerBefore counterSmallerBefore = new CounterSmallerBefore() ;
    @Test
    void testCountOfSmallerNumberIIUsingBitTree() {
        int[] input ={1,2,7,8,5} ;
        List<Integer> expected = Arrays.stream(new int[] {0,1,2,3,2})
                .boxed()
                .collect(Collectors.toList());

        assertEquals(expected, counterSmallerBefore.countOfSmallerNumberII(input));
    }

    @Test
    void testCountOfSmallerNumberIIUsingSegmentTree() {
        int[] input ={1,2,7,8,5} ;
        List<Integer> expected = Arrays.stream(new int[] {0,1,2,3,2})
                .boxed()
                .collect(Collectors.toList());

        assertEquals(expected, counterSmallerBefore.countOfSmallerNumber2UsingSegmentTree(input));
    }
}