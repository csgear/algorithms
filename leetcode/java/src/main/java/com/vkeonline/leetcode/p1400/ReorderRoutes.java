

package com.vkeonline.leetcode.p1400;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

/**
 * Leetcode [M]: 1466. Reorder Routes to Make All Paths Lead to the City Zero
 * @author csgear
 */
public class ReorderRoutes {
    public int minReorder(int n, int[][] connections) {
        List<Integer>[] adjacent = new ArrayList[n] ;
        Arrays.setAll(adjacent, k-> new ArrayList<>());
        for(int[] c : connections) {
            adjacent[c[0]].add(c[1]);
            adjacent[c[1]].add(c[0]);
        }

        int[] levels = new int[n];
        Arrays.fill(levels, -1);
        levels[0] = 0;
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(0);

        while (!queue.isEmpty()) {
            int city = queue.poll();
            for (int next : adjacent[city]) {
                if (levels[next] < 0) {
                    levels[next] = levels[city] + 1;
                    queue.offer(next);
                }
            }
        }

        int reorder = 0;

        for (int[] c : connections) {
            if (levels[c[0]] < levels[c[1]]) {
                reorder++;
            }
        }

        return reorder ;

    }
}
