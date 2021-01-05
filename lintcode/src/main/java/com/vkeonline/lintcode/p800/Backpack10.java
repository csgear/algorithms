package com.vkeonline.lintcode.p800;

/**
 * Lint code: 801. Backpack X
 * @author csgear
 */
public class Backpack10 {
    /**
     * @param n: the money you have
     * @return the minimum money you have to give
     */
    public int backPackX(int n) {
        int[] prices = {150, 250, 350} ;
        int[] dp = new int[n+1] ;

        for (int price : prices) {
            for (int j = price; j <= n; j++) {
                dp[j] = Math.max(dp[j], dp[j - price] + price);
            }
        }

        return n - dp[n];
    }
}
