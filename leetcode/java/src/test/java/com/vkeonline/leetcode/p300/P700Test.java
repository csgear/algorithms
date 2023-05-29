package com.vkeonline.leetcode.p300;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiaojun.yang
 */
class P700Test {

    @Test
    void buySellStock5() {
        int[] prices = {1,2,3,0,2} ;
        int expected = 3 ;
        BuySellStock5 buySellStock5 = new BuySellStock5() ;
        assertEquals(expected, buySellStock5.maxProfit(prices));
    }
}