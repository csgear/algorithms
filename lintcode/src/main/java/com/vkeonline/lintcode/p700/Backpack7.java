package com.vkeonline.lintcode.p700;

/**
 * Lint code: 798. Backpack VII
 * @author csgear
 */
public class Backpack7 {
    /**
     * @param n: the money of you
     * @param prices: the price of rice[i]
     * @param weight: the weight of rice[i]
     * @param amounts: the amount of rice[i]
     * @return the maximum weight
     */
    public int backPackVII(int n, int[] prices, int[] weight, int[] amounts) {
        int m = prices.length ;
        int[] dp = new int[n+1] ;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < amounts[i]; j++) {
                for (int k = n; k >= prices[i] ; k--) {
                    dp[k] = Math.max(dp[k], dp[k - prices[i]] + weight[i]) ;
                }
            }
        }

        return dp[n] ;
    }
}
