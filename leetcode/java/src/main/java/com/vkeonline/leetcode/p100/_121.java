package com.vkeonline.leetcode.p100;

public class _121 {
    class Solution {
        public int maxProfit(int[] prices) {
            int low = Integer.MAX_VALUE ;
            int max = 0 ;

            for(int i = 0 ; i < prices.length ; i++) {
                if(prices[i] < low) low = prices[i] ;
                if(prices[i] - low > max) max = prices[i] - low ;
            }
            return max ;
        }
    }

    class Solution1 {
        public int maxProfit(int[] prices) {
            if(prices.length == 0) return 0 ;

            int n = prices.length ;
            int[] minPrices = new int[n] ;
            int[] maxProfits = new int[n] ;

            minPrices[0] = prices[0] ;
            maxProfits[0] = 0 ;

            for(int i = 1 ; i < n ; i++) {
                minPrices[i] = Math.min(minPrices[i-1], prices[i]) ;
                maxProfits[i] = Math.max(maxProfits[i-1], prices[i] - minPrices[i-1]) ;
            }

            return maxProfits[n-1] ;
        }
    }
}
