package com.vkeonline.leetcode.p400;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Leetcode [M]: 456. 132 Pattern
 *
 * @author csgear
 */
public class Find132Pattern {
    public boolean find132patternN2(int[] nums) {
        int min = nums[0];
        for (int j = 1; j < nums.length; j++) {
            min = Math.min(min, nums[j]);
            if (min == nums[j]) {
                continue;
            }
            for (int k = j + 1; k < nums.length; k++) {
                if (nums[k] < nums[j] && min < nums[k]) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean find132pattern(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        Deque<Integer> stack = new ArrayDeque<>();
        int[] min = new int[nums.length];
        min[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            min[i] = Math.min(min[i - 1], nums[i]);
        }
        for (int j = nums.length - 1; j >= 0; j--) {
            if (nums[j] > min[j]) {
                while (!stack.isEmpty() && stack.peek() <= min[j]) {
                    stack.pop();
                }
                if (!stack.isEmpty() && stack.peek() < nums[j]) {
                    return true;
                }
                stack.push(nums[j]);
            }
        }
        return false;
    }
}
