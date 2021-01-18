package com.vkeonline.leetcode.year2021.jan;

import java.util.HashMap;
import java.util.Map;

/**
 * @author csgear
 */
public class MaxNumberPairs {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int result = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int x = entry.getKey();
            if (map.containsKey(k - x)) {
                result += Math.min(entry.getValue(), map.get(k - x));
            }
        }

        return result / 2;
    }
}
