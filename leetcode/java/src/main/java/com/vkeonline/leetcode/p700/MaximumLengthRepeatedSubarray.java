package com.vkeonline.leetcode.p700;

/**
 * Leetcode [M]: 718. Maximum Length of Repeated Subarray
 * @author csgear
 */
public class MaximumLengthRepeatedSubarray {
    public int findLength(int[] nums1, int[] nums2) {
        int ans = Integer.MIN_VALUE;
        int[][] dp = new int[nums1.length + 1][nums2.length + 1];

        for (int i = 1; i <= nums1.length ; i++) {
            for (int j = 1; j <= nums2.length; j++) {
                dp[i][j] = nums1[i-1] == nums2[j-1] ? dp[i-1][j-1] + 1 : 0;
                ans = Math.max(ans, dp[i][j]) ;
            }

        }
        return ans ;
    }
}
