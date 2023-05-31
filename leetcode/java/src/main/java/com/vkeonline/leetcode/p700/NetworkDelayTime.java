package com.vkeonline.leetcode.p700;

import java.util.*;

/**
 * Leetcode [M]: 743. Network Delay Time
 * @author csgear
 */
public class NetworkDelayTime {
    public int networkDelayTime(int[][] times, int N, int K) {
        return dijkstra(times, N, K);
    }

    private int dijkstra(int[][] times, int N, int K) {
        Map<Integer, Map<Integer, Integer>> map = new HashMap<>();
        for (int[] time : times) {
            map.putIfAbsent(time[0], new HashMap<>());
            map.putIfAbsent(time[1], new HashMap<>());
            map.get(time[0]).put(time[1], time[2]);
        }

        Set<Integer> visited = new HashSet<>();

        PriorityQueue<int[]> pq = new PriorityQueue<>((n1, n2) -> n1[1] - n2[1]);

        pq.offer(new int[]{ K, 0 });

        int dist = 0;
        while (!pq.isEmpty()) {

            int[] curr = pq.poll();

            if (!visited.add(curr[0]))
                continue;

            dist = curr[1];

            for (Map.Entry<Integer, Integer> e : map.get(curr[0]).entrySet()) {
                if (!visited.contains(e.getKey()))
                    pq.offer(new int[]{ e.getKey(), e.getValue() + dist });
            }
        }

        return visited.size() == N ? dist : -1;
    }

    private int bellmanford(int[][] times, int N, int K) {
        int[] dist = new int[N];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[K - 1] = 0;
        for (int i = 1; i < N; ++i) {
            for (int[] time : times) {
                int u = time[0] - 1;
                int v = time[1] - 1;
                int w = time[2];
                dist[v] = Math.min(dist[v], dist[u] + w);
            }
        }
        int max = Arrays.stream(dist).max().getAsInt();
        return max == Integer.MAX_VALUE ? -1 : max;
    }
}

