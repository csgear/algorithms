package com.vkeonline.leetcode.p200;

/**
 * Leetcode [M]: 279. Perfect Squares
 * @author csgear
 */
public class PerfectSquare {
    public int numSquares(int n) {
        int[] dp = new int[n+1] ;
        for (int i = 1; i <= n; i++) {
            int min = i ;
            int square = 1 ;
            int j = 1 ;
            while(square <= i) {
                min = Math.min(min, 1 + dp[i - square]) ;
                j++ ;
                square = j * j ;
            }
            dp[i] = min ;
        }
        return dp[n] ;
    }
}
