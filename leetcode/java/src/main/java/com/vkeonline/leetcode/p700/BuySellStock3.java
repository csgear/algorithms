////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// File: BuySellStockWithFee.java
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

package com.vkeonline.leetcode.p700;

/**
 * Leetcode [M]: 714. Best Time to Buy and Sell Stock with Transaction Fee
 * @author csgear
 */
public class BuySellStock3 {
    public int maxProfit(int[] prices, int fee) {
        int sell = 0;
        int own = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            sell = Math.max(sell, own + prices[i] - fee);
            own = Math.max(own, sell - prices[i]);
        }
        return sell;

    }

}
