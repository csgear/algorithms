package com.vkeonline.leetcode.p300;

/**
 * Leetcode [M]: 309. Best Time to Buy and Sell Stock with Cooldown
 * @author csgear
 */
public class BuySellStock4 {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int[] sell = new int[prices.length] ;
        int[] buy = new int[prices.length] ;
        buy[0] = -prices[0] ;
        buy[1] = Math.max(buy[0], -prices[1]) ;
        sell[0] = 0 ;
        sell[1] = Math.max(sell[0], buy[0] + prices[1]) ;
        for (int i = 2; i < prices.length; i++) {
            sell[i] = Math.max(sell[i-1], buy[i-1] + prices[i]) ;
            buy[i] = Math.max(buy[i-1], sell[i-2] - prices[i]) ;
        }
        return sell[prices.length - 1] ;
    }
}
