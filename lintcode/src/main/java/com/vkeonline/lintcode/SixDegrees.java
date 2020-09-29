package com.vkeonline.lintcode;

import java.util.*;

/**
 * LintCode: 531. Six Degrees
 * @author csgear
 */
public class SixDegrees {

    public int sixDegrees(List<UndirectedGraphNode> graph,
                          UndirectedGraphNode s,
                          UndirectedGraphNode t) {

        if (s == t) {
            return 0;
        }

        Set<UndirectedGraphNode> visited = new HashSet<>();
        Queue<UndirectedGraphNode> queue = new ArrayDeque<>();

        queue.offer(s);
        visited.add(s);
        int res = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            res += 1;
            for (int i = 0; i < size; i++) {
                UndirectedGraphNode current = queue.poll();
                for (UndirectedGraphNode node : current.neighbors) {
                    if (node == t) return res;
                    if (visited.contains(node)) continue;
                    queue.offer(node);
                    visited.add(node);
                }
            }
        }

        return -1;
    }
}

