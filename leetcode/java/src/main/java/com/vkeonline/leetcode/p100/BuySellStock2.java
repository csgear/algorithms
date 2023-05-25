/*
 * Copyright (c) 2023 HyTrust Inc. All rights reserved.
 */

package com.vkeonline.leetcode.p100;

/**
 * Leetcode [E]: 122. Best Time to Buy and Sell Stock II
 * @author csgear
 */
public class BuySellStock2 {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0 ;
        }

        int profit = 0 ;

        for (int i = 1; i < prices.length; i++) {
            if( prices[i] > prices[i-1]) {
                profit += prices[i] - prices[i-1] ;
            }
        }

        return profit ;
    }
}
