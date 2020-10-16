package com.vkeonline.leetcode.p300;

import java.util.Arrays;

public class _312 {
    class Solution {
        public int maxCoins(int[] nums) {
            int n = nums.length;
            if(n <= 0) return 0;
            int[][] DP = new int[n][n];
            for(int len=1; len<=n; len++) {
                for(int i=0; i<=n-len; i++) {
                    int j = i+len-1;
                    int max = 0;
                    for(int k=i; k<=j; k++) {
                        int left = i==0 ? 1 : nums[i-1];
                        int right = j==n-1 ? 1 : nums[j+1];
                        int leftVal = k==i ? 0 : DP[i][k-1];
                        int rightVal = k==j ? 0 : DP[k+1][j];
                        max = Math.max(max, left*nums[k]*right+leftVal+rightVal);
                    }
                    DP[i][j] = max;
                }
            }
            return DP[0][n-1];

        }
    }
}
