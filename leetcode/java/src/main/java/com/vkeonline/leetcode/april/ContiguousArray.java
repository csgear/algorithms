package com.vkeonline.leetcode.april;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {
    /**
     * store (count, index) to a map, whenever we see the same count occurs
     * we update the maxLen result to be the length of (current index - first index)
     * @param nums
     * @return
     */
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxlen = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = count + (nums[i] == 1 ? 1 : -1);
            if (map.containsKey(count)) {
                maxlen = Math.max(maxlen, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }
        return maxlen;
    }
}
