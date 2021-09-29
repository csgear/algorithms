////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// File: P000Test.java
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Author: xiaoyang
//
// Nokia - Confidential
// Do not use, distribute, or copy without consent of Nokia.
// Copyright (c) 2021 Nokia. All rights reserved.
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package com.vkeonline.leetcode.p000;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class P000Test {
    @Test
    void testSearchRangeCase1() {
        FindFirstAndLast findFirstAndLast = new FindFirstAndLast() ;
        int target = 8 ;
        int[] nums = {5,7,7,8,8,10} ;
        int[] expected = {3,4} ;
        assertArrayEquals(expected, findFirstAndLast.searchRange(nums, target)) ;
    }

    @Test
    void testSearchInRotatedSortedArrayCase1() {
        SearchInRotatedSortedArray searchInRotatedSortedArray = new SearchInRotatedSortedArray() ;
        int[] nums = {4,5,6,7,0,1,2} ;
        int target = 0 ;
        int expected = 4 ;
        assertEquals(expected, searchInRotatedSortedArray.search(nums, target));
    }

    @Test
    void jumpGameIITestCase1() {
        JumpGameII jumpGameII = new JumpGameII() ;
        int[] nums = {2,3,1,1,4} ;
        int expected = 2 ;
        assertEquals(expected, jumpGameII.jump(nums));
    }

    @Test
    void searchMatrix() {
        Search2DMatrix search2DMatrix = new Search2DMatrix();
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50},
        };
        int target = 3;
        boolean expected = true ;
        assertEquals(expected, search2DMatrix.searchMatrix(matrix,target));
    }

    @Test
    void climbStairsTestCase1() {
        ClimbingStairs climbingStairs = new ClimbingStairs() ;
        int n = 3 ;
        int expected = 3 ;
        assertEquals(expected, climbingStairs.climbStairs(n));
    }

    @Test
    void minCostClimbingStairsTestCase1() {
        MinCostClimbingStairs minCostClimbingStairs = new MinCostClimbingStairs() ;
        int[] cost = {1,100,1,1,1,100,1,1,100,1} ;
        int expected = 6 ;
        assertEquals(expected, minCostClimbingStairs.minCostClimbingStairs(cost));
    }
}
