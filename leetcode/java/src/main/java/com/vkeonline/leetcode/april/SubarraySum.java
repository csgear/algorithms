package com.vkeonline.leetcode.april;

import java.util.HashMap;
import java.util.Map;

public class SubarraySum {
    public int subarraySum(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int prefixSum = 0;
        int result = 0;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(prefixSum, 1);
        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            result += map.getOrDefault(prefixSum - k, 0);
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return result;

    }
}
