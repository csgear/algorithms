

package com.vkeonline.leetcode.p1100;

/**
 * Leetcode [M]: 1186. Maximum Subarray Sum with One Deletion
 * @author csgear
 */
public class MaximumSubarraySum {
    public int maximumSum(int[] arr) {
        // dp[i][k] 表示以arr[i]结尾，删除k次的非空子数组的最大和
        int n = arr.length ;
        int dp0 = arr[0], dp1 = 0, res = dp0 ;
        for (int i = 1; i < n; i++) {
            dp1 = Math.max(dp0, dp1 + arr[i]) ;
            dp0 = Math.max(dp0, 0) + arr[i] ;
            res = Math.max(res, Math.max(dp0, dp1));
        }
        return res ;
    }
}
