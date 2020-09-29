package com.vkeonline.lintcode.p900;

import java.util.HashMap;

/**
 * LintCode: 911. Maximum Size Subarray Sum Equals k
 * @author csgear
 */
public class MaxSizeSubArrayK {
    /**
     * @param nums: an array
     * @param k:    a target value
     * @return: the maximum length of a subarray that sums to k
     */
    public int maxSubArrayLen(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int[] sum = new int[n + 1];
        int ans = 0;
        map.put(k, 0);
        for (int i = 1; i <= n; i++) {
            sum[i] = sum[i - 1] + nums[i - 1];
            if (map.containsKey(sum[i])) {
                ans = Math.max(ans, i - map.get(sum[i]));
            }
            if (!map.containsKey(sum[i] + k)) {
                map.put(sum[i] + k, i);
            }
        }
        return ans;
    }
}

