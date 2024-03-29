package com.vkeonline.leetcode.p400;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


class P400Test {



    @Test
    void removeKdigits() {
        RemoveKDigits removeKDigits = new RemoveKDigits() ;
        String num = "10200" ;
        int k = 1 ;
        String expected = "200" ;
        assertEquals(expected, removeKDigits.removeKdigits(num, k));
    }
    @Test
    void testMatchsticksSquare() {
        MatchsticksSquare matchsticksSquare = new MatchsticksSquare() ;
        int[] matchsticks = {1,1,2,2,2} ;
        boolean expected = true ;
        assertEquals(expected, matchsticksSquare.makeSquare(matchsticks));
    }

    @Test
    void fourSumCount() {
        FourSum2 fourSum2 = new FourSum2() ;
        int[] nums1 = {1,2}, nums2 = {-2,-1}, nums3 = {-1,2}, nums4 = {0,2} ;
        int expected = 2 ;
        assertEquals(expected, fourSum2.fourSumCount(nums1,
                nums2, nums3, nums4));
    }

    @Test
    void arrangeCoins() {
        int n = 5 ;
        int expected = 2 ;
        ArrangeCoins arrangeCoins = new ArrangeCoins() ;
        assertEquals(expected, arrangeCoins.arrangeCoins(n));
    }
}
