package com.vkeonline.leetcode.p200;

import java.util.PriorityQueue;

/**
 * Leetcode [M]: Kth Largest Element in an Array
 * @author csgear
 */
public class KthLargestElement {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int num : nums)
            queue.offer(num);
        for (int i = 0; i < k - 1; i++)
            queue.poll();
        return queue.poll();
    }
}


