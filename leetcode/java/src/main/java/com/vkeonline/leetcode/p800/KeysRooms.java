package com.vkeonline.leetcode.p800;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Leetcode [M]: 841. Keys and Rooms
 * @author csgear
 */
public class KeysRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] visited = new boolean[n] ;
        Queue<Integer> queue = new LinkedList<>();
        visited[0] = true ;
        queue.offer(0);
        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (int key : rooms.get(node)) {
                if(!visited[key]) {
                    queue.offer(key) ;
                    visited[key] = true ;
                }
            }
            n = n - 1;
        }

        return n == 0;
    }
}
