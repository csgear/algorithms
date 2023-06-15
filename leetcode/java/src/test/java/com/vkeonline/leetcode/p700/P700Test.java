package com.vkeonline.leetcode.p700;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.vkeonline.leetcode.utils.Utils;
import org.junit.jupiter.api.Test;

public class P700Test {
    @Test
    void testAllPathsSourceTarget() {
        AllPathFromSourceToTarget allPathFromSourceToTarget = new AllPathFromSourceToTarget() ;
        int[][] graph = {{1,2},{3},{3},{}} ;
        int[][] expected = {{0,1,3},{0,2,3}} ;
        assertEquals(Utils.twoDimArrayToList(expected) ,
                allPathFromSourceToTarget.allPathsSourceTarget(graph)) ;
    }

    @Test
    void maxProfit() {
        int[] prices = {1, 3, 2, 8, 4, 9} ;
        int fee = 2 ;
        BuySellStock6 buySellStock6 = new BuySellStock6() ;
        int expected = 8 ;
        assertEquals(expected, buySellStock6.maxProfit(prices, fee));
    }

    @Test
    void maxProfit1() {
        int[] prices = {1, 3, 2, 8, 4, 9} ;
        int fee = 2 ;
        BuySellStock6 buySellStock6 = new BuySellStock6() ;
        int expected = 8 ;
        assertEquals(expected, buySellStock6.maxProfit1(prices, fee));
    }

    @Test
    void numSubarrayProductLessThanK() {
        SubArrayProd subArrayProd = new SubArrayProd();

        int[] nums = {10, 5, 2, 6};
        int k = 100;
        int expected = 8 ;
        assertEquals(expected, subArrayProd.numSubarrayProductLessThanK(nums, k));
    }

    @Test
    void findLength() {
        MaximumLengthRepeatedSubarray maximumLengthRepeatedSubarray = new MaximumLengthRepeatedSubarray() ;
        int[] nums1 = {0,0,0,0,0} ;
        int[] nums2 = {0,0,0,0,0} ;
        int expected = 5 ;
        assertEquals(expected, maximumLengthRepeatedSubarray.findLength(nums1, nums2)) ;
    }

}
