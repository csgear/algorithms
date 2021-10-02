package com.vkeonline.leetcode.p100;

/**
 * Leetcode [E]: 121. Best Time to Buy and Sell Stock
 *
 * @author csgear
 */
public class BuySellStock {

    public int maxProfit(int[] prices) {
        int low = Integer.MAX_VALUE;
        int max = 0;

        for (int price : prices) {
            if (price < low) {
                low = price;
            }
            if (price - low > max) {
                max = price - low;
            }
        }
        return max;
    }

    public int maxProfitDP(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int n = prices.length;
        int[] minPrices = new int[n];
        int[] maxProfits = new int[n];

        minPrices[0] = prices[0];
        maxProfits[0] = 0;

        for (int i = 1; i < n; i++) {
            minPrices[i] = Math.min(minPrices[i - 1], prices[i]);
            maxProfits[i] = Math.max(maxProfits[i - 1], prices[i] - minPrices[i - 1]);
        }
        return maxProfits[n - 1];
    }
}
