package com.vkeonline.leetcode.thirtydays;

public class SellStockII {
    public int maxProfit(int[] prices) {
        int diff = 0;
        for(int i = 1; i<prices.length; i++){
            if(prices[i]>prices[i-1]){
                diff += prices[i]-prices[i-1];
            }
        }
        return diff;
    }
}
