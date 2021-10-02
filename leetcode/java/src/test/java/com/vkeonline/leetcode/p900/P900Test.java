package com.vkeonline.leetcode.p900;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class P900Test {

    @Test
    void intervalIntersection() {
        IntervalListIntersections intervalListIntersections = new IntervalListIntersections() ;
        int[][] firstList = {{1,7}};
        int[][] secondList = {{3,10}} ;
        int[][] expected = {{3,7}} ;
        int[][] result = intervalListIntersections.intervalIntersection(firstList, secondList);

        assertEquals(expected.length, result.length);
        for (int i = 0; i < expected.length; i++) {
            assertArrayEquals(expected[i], result[i]);
        }
    }
}
