package com.vkeonline.leetcode.p900;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class P900Test {

    @Test
    void testWordSubsets() {
        String[] words1 = {"amazon","apple","facebook","google","leetcode"} ;
        String[] words2 = {"e","o"} ;

        WordSubsets wordSubsets = new WordSubsets() ;

        List<String> expected = Arrays.asList("facebook","google","leetcode") ;

        List<String> result = wordSubsets.wordSubsets(words1, words2) ;

        assertEquals(expected, result);
    }

    @Test
    void testIntervalIntersection() {
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

    @Test
    void movesToStamp() {
        StampingSequence stampingSequence = new StampingSequence() ;
        String stamp = "abc";
        String target = "ababc" ;
        int[] expected = {0,2} ;

        assertArrayEquals(expected, stampingSequence.movesToStamp(stamp, target));
    }
}
