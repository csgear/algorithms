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
public class BuySellStock6 {
    public int maxProfit(int[] prices, int fee) {
        int pre_sell = 0;
        int pre_buy = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            int sell = Math.max(pre_sell, pre_buy + prices[i] - fee);
            int buy = Math.max(pre_buy, pre_sell - prices[i]);
            pre_sell = sell ;
            pre_buy = buy ;

        }
        return pre_sell;
    }

    public int maxProfit1(int[] prices, int fee) {
        int n = prices.length ;
        int[] sell = new int[n] ;
        int[] buy = new int[n] ;
        buy[0] = -prices[0] ;
        sell[0] = 0 ;
        for (int i = 1; i < n; i++) {
            buy[i] = Math.max(buy[i-1], sell[i-1] - prices[i]) ;
            sell[i] = Math.max(sell[i-1], buy[i-1] + prices[i] - fee) ;
        }
        return sell[n-1] ;
    }
}
