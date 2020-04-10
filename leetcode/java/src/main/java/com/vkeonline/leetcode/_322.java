package com.vkeonline.leetcode;

import java.util.Arrays;

public class _322 {
    public static void main(String[] args) {
        Solution1 solution1 = new _322().new Solution1() ;
        int[] coins = {1,2,3,3,7} ;
        int target = 7 ;

        System.out.println(solution1.backPackV(coins, target));

    }
    public class Solution1 {
        public int backPackV(int[] nums, int target) {
            if (target == 0)
                return 0;
            int[] dp = new int[target + 1];
            Arrays.fill(dp, target + 1);

            dp[0] = 0;

            for (int i = 0; i <= target; i++) {
                for (int num : nums) {
                    if (i - num >= 0)
                        dp[i] = Math.min(dp[i], dp[i - num] + 1);
                }
            }
            return dp[target] > target ? -1 : dp[target];
        }
    }

    class Solution {
        public int coinChange(int[] coins, int amount) {
            if (amount == 0)
                return 0;
            int[] dp = new int[amount + 1];
            Arrays.fill(dp, amount + 1);

            dp[0] = 0;
            for (int i = 1; i <= amount; i++) {
                for (int j = 0; j < coins.length; j++) {
                    if (i - coins[j] >= 0)
                        dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }

            return dp[amount] > amount ? -1 : dp[amount];
        }
    }
}
