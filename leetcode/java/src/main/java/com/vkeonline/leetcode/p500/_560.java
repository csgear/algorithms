package com.vkeonline.leetcode.p500;

import java.util.HashMap;

public class _560 {
    class Solution {
        public int subarraySum(int[] nums, int k) {
            HashMap<Integer, Integer> map = new HashMap<>();

            int prefix = 0;
            int result = 0;

            map.put(0, 1);
            for (int num : nums) {
                prefix += num;
                result += map.getOrDefault(prefix - k, 0);
                map.put(prefix, map.getOrDefault(prefix, 0) + 1);
            }

            return result;
        }
    }
}
