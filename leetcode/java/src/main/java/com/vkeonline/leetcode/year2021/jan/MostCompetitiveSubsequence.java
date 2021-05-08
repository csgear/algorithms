package com.vkeonline.leetcode.year2021.jan;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author csgear
 */
public class MostCompetitiveSubsequence {
    public int[] mostCompetitive(int[] nums, int k) {
        int[] result = new int[k];
        Deque<Integer> queue = new LinkedList<>();
        int len = nums.length - k;
        for (int num : nums) {
            while (!queue.isEmpty() && num < queue.peekLast() && len > 0) {
                len--;
                queue.removeLast();
            }
            queue.offer(num);
        }
        while (len > 0) {
            len--;
            queue.removeLast();
        }
        int i = 0;
        while (!queue.isEmpty()) {
            result[i++] = queue.removeFirst();
        }
        return result;
    }

}
