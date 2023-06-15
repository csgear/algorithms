package com.vkeonline.leetcode.p1100;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiaojun.yang
 */
class P1100Test {

    @Test
    void testCanMakePaliQueries() {
        PalindromeFromSubstring palindromeFromSubstring = new PalindromeFromSubstring() ;
        String s = "abcda" ;
        int[][] queries = {{3,3,0},{1,2,0},{0,3,1},{0,3,2},{0,4,1}} ;
        List<Boolean> expected = List.of(true,false,false,true,true) ;
        assertEquals(expected, palindromeFromSubstring.canMakePaliQueries(
                s, queries
        ));
    }

    @Test
    void testShortestAlternatingPaths() {
        ShortestPathAlternatingColors shortestPathAlternatingColors = new ShortestPathAlternatingColors() ;
        int n = 3 ;
        int[][] redEdges = {{0,1}}, blueEdges = {{2,1}} ;
        int[] expected = {0,1,-1} ;
        assertArrayEquals(expected, shortestPathAlternatingColors.shortestAlternatingPaths(
                n, redEdges, blueEdges
        ));

    }

    @Test
    void testNumSmallerByFrequency() {
        CompareStringsByFreq compareStringsByFreq = new CompareStringsByFreq() ;
        String[] queries = {"bbb","cc"} ;
        String[]  words = {"a","aa","aaa","aaaa"} ;
        int[] expected = {1,2} ;
        assertArrayEquals(expected, compareStringsByFreq.numSmallerByFrequency(
                queries, words
        ));
    }

    @Test
    void maxRepOpt1() {
        String text = "aaabaaa" ;
        int expected = 6 ;
        SwapLongestRepeatedCharacterSubstring swapLongestRepeatedCharacterSubstring =
                new SwapLongestRepeatedCharacterSubstring() ;
        assertEquals(expected, swapLongestRepeatedCharacterSubstring.maxRepOpt1(text));
    }
}