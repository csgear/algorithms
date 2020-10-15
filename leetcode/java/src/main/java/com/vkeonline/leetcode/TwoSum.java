package com.vkeonline.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i);
        }

        for (int i = 0; i < numbers.length; i++) {
            int x = numbers[i];
            if (map.get(target - x) != null && map.get(target - x) != i) {
                return new int[]{i, map.get(target - x)};
            }
        }

        return new int[]{-1, -1};
    }
}

