package com.vkeonline.leetcode.p1600;

import java.util.PriorityQueue;

/**
 * Leetcode: [M]: 1642. Furthest Building You Can Reach
 *
 * @author csgear
 */
public class FurthestBuilding {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(
                (a, b) -> b - a
        );
        for (int i = 0; i < heights.length - 1; i++) {
            int climb = heights[i + 1] - heights[i];
            if (climb <= 0) {
                continue;
            }
            queue.add(climb);
            bricks -= climb;
            if (bricks < 0 && ladders == 0) {
                return i;
            }

            if (bricks < 0) {
                bricks += queue.remove();
                ladders--;
            }
        }

        return heights.length - 1;
    }
}
