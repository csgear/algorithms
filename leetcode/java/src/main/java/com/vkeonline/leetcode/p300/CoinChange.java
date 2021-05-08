package com.vkeonline.leetcode.p300;

import java.util.Arrays;

/**
 * Leetcode [M]: 322. Coin Change
 *
 * @author csgear
 */
public class CoinChange {
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
