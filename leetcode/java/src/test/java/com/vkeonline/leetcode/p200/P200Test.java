package com.vkeonline.leetcode.p200;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class P200Test {

    @Test
    void rob() {
        HouseRobber2 houseRobber2 = new HouseRobber2();
        int[] nums = {2, 3, 2};
        int expected = 3 ;
        assertEquals(expected, houseRobber2.rob(nums));
    }

    @Test
    void testSingleNumber() {
        SingleNumber3 singleNumber3 = new SingleNumber3() ;
        int[] nums = {1,2,1,3,2,5} ;
        int[] expected = {3,5} ;
        assertArrayEquals(expected, singleNumber3.singleNumber(nums));

    }

    @Test
    void testCourseScheduleIIDfs() {
        CourseScheduleIIDfs courseScheduleIIDfs = new CourseScheduleIIDfs() ;
        int numCourses = 4 ;
        int[][] prerequisites = {{1,0},{2,0},{3,1},{3,2}} ;
        int[] expected = {0,2,1,3} ;
        assertArrayEquals(expected, courseScheduleIIDfs.findOrder(
                numCourses, prerequisites
        ));

    }


    @Test
    void testCourseScheduleIIBfs() {
        CourseScheduleIIBfs courseScheduleIIBfs = new CourseScheduleIIBfs() ;
        int numCourses = 4 ;
        int[][] prerequisites = {{1,0},{2,0},{3,1},{3,2}} ;
        int[] expected = {0,1,2,3} ;
        assertArrayEquals(expected, courseScheduleIIBfs.findOrder(
                numCourses, prerequisites
        ));
    }

    @Test
    void testValidTree() {
        GraphValidTree graphValidTree = new GraphValidTree() ;
        int n = 5 ;
        int[][] edges = {{0,1},{0,2},{0,3},{1,4}} ;
        boolean expected = true ;
        assertEquals(expected, graphValidTree.validTree(n, edges));
    }

    @Test
    void testGameOfLife1() {
        int[][] board = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}} ;
        int[][] expected = {{0,0,0},{1,0,1},{0,1,1},{0,1,0}} ;
        GameOfLife gameOfLife = new GameOfLife() ;
        gameOfLife.gameOfLife1(board);
        for (int i = 0; i < board.length; i++) {
            assertArrayEquals(expected[i], board[i]);
        }
    }

    @Test
    void testGameOfLife() {
        int[][] board = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}} ;
        int[][] expected = {{0,0,0},{1,0,1},{0,1,1},{0,1,0}} ;
        GameOfLife gameOfLife = new GameOfLife() ;
        gameOfLife.gameOfLife(board);
        for (int i = 0; i < board.length; i++) {
            assertArrayEquals(expected[i], board[i]);
        }
    }

    @Test
    void findKthLargest() {
        KthLargestElement kthLargestElement = new KthLargestElement() ;
        int[] nums = { 3, 2, 1, 5, 6, 4 };
        int k = 2 ;
        int expected = 5 ;
        assertEquals(expected, kthLargestElement.findKthLargest(nums, k) );
    }

    @Test
    void searchMatrix() {
        int[][] matrix = {
                { 1, 4, 7, 11, 15 },
                { 2, 5, 8, 12, 19 },
                { 3, 6, 9, 16, 22 },
                { 10, 13, 14, 17, 24 },
                { 18, 21, 23, 26, 30 }
        } ;
        int target = 5 ;
        boolean expected = true ;
        Search2DMatrix2 search2DMatrix2 = new Search2DMatrix2() ;
        assertEquals(expected, search2DMatrix2.searchMatrix(matrix, target));

    }

    @Test
    void minSubArrayLen() {
        MinimumSizeSubarraySum minimumSizeSubarraySum = new MinimumSizeSubarraySum() ;
        int target = 7 ;
        int[] nums = {2,3,1,2,4,3} ;
        int expected =  2 ;
        assertEquals(expected, minimumSizeSubarraySum.minSubArrayLen(target, nums));
    }

    @Test
    void findOrder() {
        CourseScheduleIIBfs courseScheduleIIBfs = new CourseScheduleIIBfs() ;
        int numCourses = 4 ;
        int[][] prerequisites = {{1,0},{2,0},{3,1},{3,2}} ;
        int[] expected = {0,2,1,3} ;
        Arrays.sort(expected) ;
        int[] result = courseScheduleIIBfs.findOrder(numCourses, prerequisites) ;
        Arrays.sort(result);
        assertEquals(expected.length, result.length);
        assertArrayEquals(expected, result);
    }

    @Test
    void numIslands() {
        NumberOfIslands numberofIslands = new NumberOfIslands() ;
        char[][] grid = new char[][]{{'1', '1', '1', '1', '0'}, {'1', '1', '0', '1', '0'}, {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}};
        int expected = 1 ;
        assertEquals(expected, numberofIslands.numIslands(grid));
    }

    @Test
    void minCostIITest() {
        PaintHouseII paintHouseII = new PaintHouseII();
        int[][] costs = {{1, 5, 3}, {2, 9, 4}};
        int expected = 5;
        assertEquals(expected, paintHouseII.minCostII(costs));
    }

    @Test
    void minCostTest() {
        PaintHouse paintHouse = new PaintHouse();
        int[][] costs = {{17, 2, 17}, {16, 16, 5}, {14, 3, 19}};
        int expected = 10;
        assertEquals(expected, paintHouse.minCost(costs));
    }

    @Test
    void combinationSum3Test() {
        CombinationSum3 combinationSum3 = new CombinationSum3();
        int k = 3;
        int n = 7;
        List<Integer> expected = List.of(1, 2, 4);
        assertEquals(expected, combinationSum3.combinationSum3(k, n).get(0));
    }

    @Test
    void missingNumber() {
        MissingNumber missingNumber = new MissingNumber() ;
        int[] nums = {9,6,4,2,3,5,7,0,1} ;
        int expected = 8 ;
        assertEquals(expected, missingNumber.missingNumber(nums));
    }
}
