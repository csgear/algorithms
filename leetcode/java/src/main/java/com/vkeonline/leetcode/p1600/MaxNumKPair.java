package com.vkeonline.leetcode.p1600;

import java.util.HashMap;

public class MaxNumKPair {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int current : nums) {
            int complement = k - current;
            if (map.getOrDefault(complement, 0) > 0) {
                map.put(complement, map.get(complement) - 1);
                count++;
            } else {
                map.put(current, map.getOrDefault(current, 0) + 1);
            }
        }
        return count;
    }
}
