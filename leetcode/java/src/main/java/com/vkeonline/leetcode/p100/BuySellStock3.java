

package com.vkeonline.leetcode.p100;

/**
 * Leetcode [M]: 123. Best Time to Buy and Sell Stock III
 * @author xiaojun.yang
 */
public class BuySellStock3 {
    public int maxProfit(int[] prices) {
        int buy1 = Integer.MIN_VALUE ;
        int buy2 = Integer.MIN_VALUE ;
        int sell1 = 0 ;
        int sell2 = 0 ;
        for (int i = 0; i < prices.length; i++) {
            buy1 = Math.max(buy1, -prices[i]) ;
            sell1 = Math.max(sell1, buy1 + prices[i]) ;
            buy2 = Math.max(buy2, sell1 - prices[i]) ;
            sell2 = Math.max(sell2, buy2 + prices[i]) ;
        }
        return sell2 ;
    }
}
