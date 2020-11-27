package com.vkeonline.leetcode.year2020.nov;

/**
 * @author csgear
 */

public class PartitionEqualSubsetSum {
    public boolean canPartition(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        if (totalSum % 2 != 0) {
            return false;
        }
        int subSetSum = totalSum / 2;
        int n = nums.length;
        boolean[][] dp = new boolean[n + 1][subSetSum + 1];
        dp[0][0] = true;
        for (int i = 1; i <= n; i++) {
            int curr = nums[i - 1];
            for (int j = 0; j <= subSetSum; j++) {
                // can not use the current element
                if (j < curr)
                {
                    dp[i][j] = dp[i - 1][j];
                }
                // can choose to use the current element
                else {
                    dp[i][j] = dp[i - 1][j] || (dp[i - 1][j - curr]);
                }
            }
        }
        return dp[n][subSetSum];

    }
}
