package com.vkeonline.leetcode.p1200;

import com.vkeonline.leetcode.p200.ProductOfArrayExceptSelf;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiaojun.yang
 */
class P1200Test {

    @Test
    void removeCoveredIntervals() {
        int[][] intervals = {{3,10},{4,10},{5,11}} ;
        RemoveCoveredIntervals removeCoveredIntervals = new RemoveCoveredIntervals() ;
        int expected = 2 ;
        assertEquals(expected, removeCoveredIntervals.removeCoveredIntervals(intervals));
     }
    @Test
    void productExceptSelf() {
        ProductOfArrayExceptSelf poes = new ProductOfArrayExceptSelf() ;
        int[] nums = {1,2,3,4} ;
        int[] expected = {24,12,8,6} ;
        assertArrayEquals(expected , poes.productExceptSelf(nums)) ;
    }

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