package com.vkeonline.leetcode.p1200;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiaojun.yang
 */
class P1200Test {

    @Test
    void testMaxSumDivThree() {
        GreatestSumDivisibleThree greatestSumDivisibleThree = new GreatestSumDivisibleThree() ;
        int[] nums = {3,6,5,1,8} ;
        int expected = 18 ;
//        assertEquals(expected, greatestSumDivisibleThree.maxSumDivThree(nums));

        assertEquals(expected, greatestSumDivisibleThree.maxSumDivThreeReduced(nums));
    }

    @Test
    void countVowelPermutation() {
        CountVowelsPermutation countVowelsPermutation = new CountVowelsPermutation();
        int expected = 68;
        assertEquals(expected, countVowelsPermutation.countVowelPermutation(5));
    }
    @Test
    void tetClosedIsland() {
        NumberClosedIslands numberClosedIslands = new NumberClosedIslands() ;
        int[][] grid = {
                {1,1,1,1,1,1,1,0},
                {1,0,0,0,0,1,1,0},
                {1,0,1,0,1,1,1,0},
                {1,0,0,0,0,1,0,1},
                {1,1,1,1,1,1,1,0}} ;
        int expected = 2 ;
        assertEquals(expected, numberClosedIslands.closedIsland(grid));

    }

    @Test
    void testTilingRectangle() {
        TilingRectangleFewestSquares tilingRectangleFewestSquares = new TilingRectangleFewestSquares() ;
        int n = 5, m = 8 ;
        int expected =  5 ;
        assertEquals(expected, tilingRectangleFewestSquares.tilingRectangle(n, m));
    }
}