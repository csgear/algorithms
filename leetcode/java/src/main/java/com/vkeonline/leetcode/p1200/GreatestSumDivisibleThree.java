

package com.vkeonline.leetcode.p1200;

/**
 * 1262. Greatest Sum Divisible by Three
 * @author csgear
 */
public class GreatestSumDivisibleThree {
    public int maxSumDivThree(int[] nums) {
        int n = nums.length ;
        int[][] dp = new int[n+1][3] ;
        // dp[0][0] = 0, the value for [select 0 number with mod 0] = 0
        // the value for [select 0 number with mod (1/2)] = INVALID
        dp[0][1] = dp[0][2] = Integer.MIN_VALUE ;
        for (int i = 1; i <= n; i++) {
            int x = nums[i-1] ;
            for (int j = 0; j < 3; j++) {
                dp[i][(j + x) % 3] = Math.max(
                        dp[i-1][(j + x) % 3],
                        dp[i-1][j] + x
                ) ;
            }
        }
        return dp[n][0] ;
    }

    public int maxSumDivThreeReduced(int[] nums) {
        int n = nums.length ;
        int[][] dp = new int[2][3] ;
        dp[0][1] = dp[0][2] = Integer.MIN_VALUE ;
        for (int i = 1; i <= n; i++) {
            int x = nums[i-1] ;
            for (int j = 0; j < 3; j++) {
                dp[i & 1][(j + x) % 3] = Math.max(
                        dp[(i-1) & 1][(j + x) % 3],
                        dp[(i-1) & 1][j] + x
                ) ;
            }
        }
        return dp[n%2][0] ;
    }
}
