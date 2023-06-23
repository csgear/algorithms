package com.vkeonline.leetcode.p900;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class P900Test {

    @Test
    void superPalindromesInRange() {
        SuperPalindromes superPalindromes = new SuperPalindromes() ;
        String left = "4" ;
        String right = "1000" ;
        int expected = 4 ;
        assertEquals(expected, superPalindromes.superpalindromesInRange(left, right));
    }
    @Test
    void maxSubarraySumCircular() {
        MaximumSumCircularSubarray maximumSumCircularSubarray = new MaximumSumCircularSubarray();
        int[] A = {1, -2, 3, -2};
        assertEquals(3, maximumSumCircularSubarray.maxSubarraySumCircular(A));
        int[] B = {5, -3, 5};
        assertEquals(10, maximumSumCircularSubarray.maxSubarraySumCircular(B));
    }

    @Test
    void numsSameConsecDiff() {
        int n = 3 ;
        int k = 7 ;
        int[] expected = {181,292,707,818,929} ;
        NumbersSameConsecutiveDifferences numbersSameConsecutiveDifferences = new NumbersSameConsecutiveDifferences() ;

        assertArrayEquals(expected, numbersSameConsecutiveDifferences.numsSameConsecDiff(n, k));
    }

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
