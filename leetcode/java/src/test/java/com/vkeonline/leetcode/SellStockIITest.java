package com.vkeonline.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SellStockIITest {

    @Test
    void maxProfit() {
        SellStockII stii = new SellStockII() ;
        int result = stii.maxProfit(new int[]{7,1,5,3,6,4})  ;
        assertEquals(7, result);
        result = stii.maxProfit(new int[]{1, 2, 3, 4, 5}) ;
        assertEquals(4, result);
        result = stii.maxProfit(new int[]{7,6,4,3,1}) ;
        assertEquals(0, result);
    }
}