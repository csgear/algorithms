package com.vkeonline.lintcode;

import java.util.HashMap;
import java.util.Map;

/**
 * LintCode: 911. Maximum Size Subarray Sum Equals k
 */
public class MaxSubarraySumK {
    public int maxSubArrayLen(int[] nums, int k) {
        Map<Integer, Integer> csums = new HashMap<>();
        int maxLen = 0;
        int sum = 0;
        for (int i=0; i<nums.length; i++) {
            sum += nums[i];
            csums.putIfAbsent(sum, i);
            Integer j = csums.get(sum - k);
            if (j != null) {
                maxLen = Math.max(maxLen, i-j);
            }
            if (sum == k) {
                maxLen = Math.max(maxLen, i+1);
            }
        }
        return maxLen;
    }
}
