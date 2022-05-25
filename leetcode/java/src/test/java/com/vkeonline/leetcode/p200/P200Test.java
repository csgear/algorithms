package com.vkeonline.leetcode.p200;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class P200Test {

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
        CourseScheduleII courseScheduleII = new CourseScheduleII() ;
        int numCourses = 4 ;
        int[][] prerequisites = {{1,0},{2,0},{3,1},{3,2}} ;
        int[] expected = {0,2,1,3} ;
        Arrays.sort(expected) ;
        int[] result = courseScheduleII.findOrder(numCourses, prerequisites) ;
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
}
