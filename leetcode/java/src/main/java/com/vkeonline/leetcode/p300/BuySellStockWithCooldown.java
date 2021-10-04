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
public class BuySellStockWithCooldown {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int[] sell = new int[prices.length];
        int[] buy = new int[prices.length];

        sell[0] = 0;
        buy[0] = -prices[0];

        for (int i = 1; i < prices.length; i++) {
            sell[i] = Math.max(sell[i - 1], buy[i - 1] + prices[i]);
            buy[i] = Math.max(buy[i - 1], (i > 1 ? sell[i - 2] : 0) - prices[i]);
        }
        return sell[prices.length - 1];
    }
}