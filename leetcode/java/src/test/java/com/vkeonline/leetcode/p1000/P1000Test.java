package com.vkeonline.leetcode.p1000;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class P1000Test {

    @Test
    void lastStoneWeight() {
        LastStoneWeight lsw = new LastStoneWeight() ;
        int[] stones = new int[] {2,7,4,1,8,1} ;
        int result = lsw.lastStoneWeight(stones) ;
        assertEquals(1, result);
    }

    @Test
    void confusingNumber() {
        ConfusingNumber confusingNumber = new ConfusingNumber() ;
        int input = 6 ;
        boolean expected = true ;
        assertEquals(expected, confusingNumber.confusingNumber(input));
    }

    @Test
    void largestValsFromLabels() {
        LargestValuesFromLabels largestValuesFromLabels = new LargestValuesFromLabels() ;
        int[] values = {5,4,3,2,1} ;
        int[] labels = {1,1,2,2,3} ;
        int numWanted = 3 ;
        int useLimit = 1 ;
        int expected = 9 ;
        assertEquals(expected, largestValuesFromLabels.largestValsFromLabels(
                values, labels, numWanted, useLimit
        ));
    }

    @Test
    void numTilePossibilities() {
        LetterTilePossibilities letterTilePossibilities = new LetterTilePossibilities() ;

        String title = "ABB" ;
        int expected = 8 ;
        assertEquals(expected, letterTilePossibilities.numTilePossibilities(title));

    }

    @Test
    void longestStrChain() {
        LongestStringChain longestStringChain = new LongestStringChain();
        String[] words = {"xbc", "pcxbcf", "xb", "cxbc", "pcxbc"};
        int expected = 5;
        assertEquals(expected, longestStringChain.longestStrChain(words));
    }

    @Test
    void carPooling() {
        CarPooling carPooling = new CarPooling() ;

        int[][] trips = {{2,1,5},{3,3,7}} ;
        int capacity = 4 ;
        boolean expected = false ;
        assertEquals(expected, carPooling.carPooling(trips, capacity));
    }
}
