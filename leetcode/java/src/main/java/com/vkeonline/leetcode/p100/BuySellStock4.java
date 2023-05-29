/*
 * Copyright (c) 2023 HyTrust Inc. All rights reserved.
 */

package com.vkeonline.leetcode.p100;

import java.util.Arrays;

/**
 * Leetcode [H]: 188. Best Time to Buy and Sell Stock IV
 * @author csgear
 */
public class BuySellStock4 {
    public int maxProfit(int k, int[] prices) {
        k = Math.min(k, (prices.length + 1) / 2 ) ;

        int[] buy = new int[prices.length + 1] ;
        int[] sell = new int[prices.length + 1] ;

        Arrays.fill(buy, Integer.MIN_VALUE);

        for (int price : prices) {
            for (int j = 1; j <= k; j++) {
                // (j-1)th sell transaction
                buy[j] = Math.max(buy[j], sell[j - 1] - price);
                // jth buy transaction
                sell[j] = Math.max(sell[j], buy[j] + price);
            }
        }
        return sell[k] ;
    }
}
