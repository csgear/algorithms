package com.vkeonline.leetcode.p100;

/**
 * Leetcode [E]: 121. Best Time to Buy and Sell Stock
 * @author csgear
 */
public class BuySellStock1 {

    public int maxProfit(int[] prices) {
        int low = Integer.MAX_VALUE;
        int profit = 0;

        for (int price : prices) {
            if (price < low) {
                low = price;
            }
            if (price - low > profit) {
                profit = price - low;
            }
        }
        return profit;
    }

    public int maxProfitDP(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int buy = Integer.MIN_VALUE ;
        int sell =  0 ;

        for(int price : prices) {
            buy = Math.max(buy, 0 - price);
            sell = Math.max(sell, buy + price) ;
        }
        return sell ;
    }
}
