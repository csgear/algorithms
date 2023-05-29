package com.vkeonline.leetcode.p800;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

/**
 * Leetcode [M]: 841. Keys and Rooms
 * @author csgear
 */
public class KeysRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(0);
        while (!queue.isEmpty()) {
            Integer header = queue.poll();
            List<Integer> next = rooms.set(header, null);
            if (next == null)
                continue;
            for (Integer keys : next) {
                queue.offer(keys);
            }
            n = n - 1;
        }

        return n == 0;
    }
}
