////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// File: BuySellStockWithCooldown.java
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

package com.vkeonline.leetcode.p300;

/**
 * Leetcode [M]: 309. Best Time to Buy and Sell Stock with Cooldown
 * @author csgear
 */
public class BuySellStock5 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int sell = 0, preSell = 0 ;
        int buy = Integer.MIN_VALUE ;

        for(int price : prices) {
            buy = Math.max(buy, preSell - price) ;
            preSell = sell ;
            sell = Math.max(sell, buy + price) ;
        }

        return sell ;
    }
}
