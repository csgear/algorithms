package com.vkeonline.leetcode.oct;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author csgear
 */
public class RecentCounter {
    Queue<Integer> queue;
    private final static int INTERVAL = 3000;

    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.add(t);

        while (queue.size() > 0 && queue.peek() < t - INTERVAL) {
            queue.remove();
        }
        return queue.size();
    }
}
