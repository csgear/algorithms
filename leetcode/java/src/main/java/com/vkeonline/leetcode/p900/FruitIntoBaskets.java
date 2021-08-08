package com.vkeonline.leetcode.p900;

import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode [M]: 904. Fruit Into Baskets
 *
 * @author csgear
 */
public class FruitIntoBaskets {
    public int totalFruit(int[] fruits) {
        int left = 0;
        int right = 0;
        int max = 0;

        Map<Integer, Integer> t = new HashMap<>();
        while (right < fruits.length) {
            t.put(fruits[right], t.getOrDefault(fruits[right], 0) + 1);

            while (t.size() > 2) {
                int amount = t.get(fruits[left]) - 1;
                if (amount == 0) {
                    t.remove(fruits[left]);
                } else {
                    t.put(fruits[left], amount);
                }
                left++;
            }
            int window = right - left + 1;
            max = Math.max(window, max);
            right++;
        }
        return max;
    }
}
