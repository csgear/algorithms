
package com.vkeonline.leetcode.p100;

/**
 * Leetcode [E]: 122. Best Time to Buy and Sell Stock II
 * @author csgear
 */
public class BuySellStock2 {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int buy = Integer.MIN_VALUE ;
        int sell =  0 ;

        for(int price : prices) {
            buy = Math.max(buy, sell - price);
            sell = Math.max(sell, buy + price) ;
        }
        return sell ;
    }
}
