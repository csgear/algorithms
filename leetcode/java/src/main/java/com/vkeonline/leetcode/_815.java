package com.vkeonline.leetcode;

import java.util.*;

public class _815 {
    public static void main(String[] args) {
        int[][] routes = {{1, 2, 7}, {3, 6, 7}};
        int S = 1;
        int T = 6;
        Solution1 solution1 = new _815().new Solution1();
        Solution solution = new _815().new Solution();

        System.out.println(solution1.numBusesToDestination(routes, S, T));
        System.out.println(solution.numBusesToDestination(routes, S, T));
    }

    public class Solution1 {
        /**
         * @param routes: a list of bus routes
         * @param S:      start
         * @param T:      destination
         * @return: the least number of buses we must take to reach destination
         */
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

    public class Solution {
        public int numBusesToDestination(int[][] routes, int S, int T) {
            if (routes == null || routes.length == 0 || S == T) {
                return -1;
            }
            // stop --> buses
            Map<Integer, Set<Integer>> map = new HashMap<>();
            Queue<Integer> queue = new LinkedList<>();
            Set<Integer> visitedBus = new HashSet<>();
            Set<Integer> visitedStop = new HashSet<>();

            for (int i = 0; i < routes.length; i++) {
                for (int stop : routes[i]) {
                    Set<Integer> buses = map.getOrDefault(stop, new HashSet<>());
                    buses.add(i);
                    map.put(stop, buses);
                }
            }

            int res = 0;
            queue.offer(S);
            visitedStop.add(S);

            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    int currentStop = queue.poll();

                    if (currentStop == T) {
                        return res;
                    }
                    Set<Integer> buses = map.get(currentStop);
                    for (int bus : buses) {
                        if (visitedBus.add(bus)) {
                            for (int stop : routes[bus]) {
                                if (visitedStop.add(stop)) {
                                    queue.offer(stop);
                                }
                            }
                        }
                    }
                }
                res++;
            }
            return -1;
        }
    }
}
