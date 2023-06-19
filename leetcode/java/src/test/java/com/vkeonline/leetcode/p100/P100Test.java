package com.vkeonline.leetcode.p100;

import com.vkeonline.leetcode.utils.Utils;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P100Test {

    @Test
    void testTriangleMinimumTotal() {
        TriangleMinimumCost triangleMinimumCost = new TriangleMinimumCost() ;
        int[][] triangle = {{2},{3,4},{6,5,7},{4,1,8,3}};
        int expected = 11 ;
        assertEquals(expected, triangleMinimumCost.minimumTotal(
                Utils.twoDimArrayToList(triangle)));
    }

    @Test
    void buySellStock1() {
        int[] prices = {7,1,5,3,6,4} ;
        int expected = 5 ;
        BuySellStock1 buySellStock1 = new BuySellStock1() ;
        assertEquals(expected, buySellStock1.maxProfitDP(prices));
    }

    @Test
    void buySellStock2() {
        int[] prices = {7,1,5,3,6,4} ;
        int expected = 7 ;
        BuySellStock2 buySellStock2 = new BuySellStock2() ;
        assertEquals(expected, buySellStock2.maxProfit(prices));
    }

    @Test
    void buySellStock4() {
        int k = 2 ;
        int[] prices = {3,2,6,5,0,3} ;
        int expected = 7 ;
        BuySellStock4 buySellStock4 = new BuySellStock4() ;
        assertEquals(expected, buySellStock4.maxProfit(k, prices));
    }

    @Test
    void buySellStock3() {
        int[] prices = {3,3,5,0,0,3,1,4} ;
        int expected = 6 ;
        BuySellStock3 buySellStock3 = new BuySellStock3() ;
        assertEquals(expected, buySellStock3.maxProfit(prices));
    }

    @Test
    void findMin() {
        FindMinimumRotatedSortedArray findMinimumRotatedSortedArray = new FindMinimumRotatedSortedArray() ;
        int[] nums = {11,13,15,17} ;
        int expected = 11 ;
        assertEquals(expected, findMinimumRotatedSortedArray.findMin(nums));
    }

    @Test
    void findMissingRangesTestCase1() {
        int[] nums = {0,1,3,50,75} ;
        int lower = 0, upper = 99 ;

        MissingRanges missingRanges = new MissingRanges() ;
        List<String> result =  missingRanges.findMissingRanges(nums, lower, upper) ;
        List<String> expected = Arrays.asList("2","4->49","51->74","76->99") ;
        assertEquals(result, expected);
    }

    @Test
    void findPeakElement() {
        FindPeakElement findPeakElement = new FindPeakElement() ;
        int[] nums = {1,2,3,1} ;
        int expected = 2 ;
        assertEquals(expected, findPeakElement.findPeakElement(nums));
    }

    @Test
    void rob() {
        HouseRobber houseRobber = new HouseRobber() ;
        int[] nums = {1,2,3,1} ;
        int expected = 4 ;
        assertEquals(expected, houseRobber.rob(nums));
    }

    @Test
    void wordBreak() {
        WordBreak wordBreak = new WordBreak();
        String s = "leetcode";
        List<String> wordDict = Arrays.asList("leet", "code");
        boolean expected = true;
        assertEquals(expected, wordBreak.wordBreak(s, wordDict));
    }

    @Test
    void candy() {
        Candy candy = new Candy();
        int[] ratings = {1, 0, 2};
        int expected = 5;
        assertEquals(expected, candy.candy(ratings));
    }

    @Test
    void candy2() {
        Candy candy = new Candy();
        int[] ratings = {1, 0, 2};
        int expected = 5;
        assertEquals(expected, candy.candy2(ratings));
    }

    @Test
    void rightSideView() {
    }

    @Test
    void rightSideView1() {
    }
}
