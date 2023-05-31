package com.vkeonline.leetcode.year2020.oct;

import com.vkeonline.leetcode.p300.BuySellStock4;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiaojun.yang
 */
class P300Test {

    @Test
    void maxProfit() {
        BuySellStock4 buySellStock4 = new BuySellStock4() ;
        int[] prices = {1,2,3,0,2} ;
        int expected = 3 ;
        assertEquals(expected, buySellStock4.maxProfit(prices));
    }
}