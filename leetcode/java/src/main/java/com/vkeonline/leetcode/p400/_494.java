package com.vkeonline.leetcode.p400;

public class _494 {
    class Solution {
        public int findTargetSumWays(int[] nums, int S) {
            int sum = 0;
            for (int num : nums) sum += num;

            if (sum < Math.abs(S)) {
                return 0;
            }

            int doubleSum = sum * 2;
            int n = nums.length;
            int[][] dp = new int[n][doubleSum + 1];

            if (nums[0] == 0) dp[0][sum] = 2;
            else {
                dp[0][sum - nums[0]] = 1;
                dp[0][sum + nums[0]] = 1;
            }

            for (int i = 1; i < n; i++) {
                for (int j = 0; j <= doubleSum; j++) {
                    if (j - nums[i] >= 0) {
                        dp[i][j] += dp[i - 1][j - nums[i]];
                    }

                    if (j + nums[i] <= doubleSum) {
                        dp[i][j] += dp[i - 1][j + nums[i]];
                    }
                }
            }

            return dp[n - 1][S + sum];
        }
    }
}
