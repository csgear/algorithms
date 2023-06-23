package com.vkeonline.leetcode.p900;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Leetcode [E]: 933. Number of Recent Calls
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
