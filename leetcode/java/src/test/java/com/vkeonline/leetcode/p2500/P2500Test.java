package com.vkeonline.leetcode.p2500;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author csgear
 */
class P2500Test {

    @Test
    void vowelStrings() {
        CountVowelStringsRanges countVowelStringsRanges = new CountVowelStringsRanges() ;
        String[] words = {"aba","bcb","ece","aa","e"} ;
        int[][]  queries = {{0,2},{1,4},{1,1}} ;
        int[] expected = {2,3,0} ;
        assertArrayEquals(expected, countVowelStringsRanges.vowelStrings(words, queries));
    }

    @Test
    void minCapability() {
        HouseRobber4 houseRobber4 = new HouseRobber4() ;
        int[] nums = {2,3,5,9} ;
        int  k = 2 ;
        int expected = 5 ;
        assertEquals(expected, houseRobber4.minCapability(nums, k));
    }
}