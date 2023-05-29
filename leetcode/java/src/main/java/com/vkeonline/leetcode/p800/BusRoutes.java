package com.vkeonline.leetcode.p800;

import java.util.*;

/**
 * Leetcode [H]: 815. Bus Routes
 * @author csgear
 */
public class BusRoutes {
    public int numBusesToDestination(int[][] routes, int S, int T) {
        // Write your code here
        if (routes == null || routes.length == 0 || S == T) {
            return -1;
        }
        // Map<Integer, Boolean> visited = new HashMap<>();
        HashSet<Integer> visited = new HashSet<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < routes.length; i++) {
            int[] route = routes[i];
            for (int j = 0; j < route.length; j++) {
                int stop = route[j];
                List<Integer> buses = map.getOrDefault(stop, new ArrayList<>());
                buses.add(i);
                map.put(stop, buses);
            }
        }

        int res = 0;
        Queue<Integer> q = new LinkedList<>();
        q.offer(S);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int p = q.poll();

                if (p == T) {
                    return res;
                }
                List<Integer> buses = map.get(p);
                for (Integer bus : buses) {
                    if (visited.contains(bus)) {
                        continue;
                    }
                    visited.add(bus);
                    int[] nexts = routes[bus];
                    for (Integer next : nexts) {
                        q.offer(next);
                    }
                }
            }
            res++;
        }
        return -1;
    }
}
