package com.vkeonline.leetcode.p1100;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Leetcode [M]: 1197. Minimum Knight Moves
 * @auther csger
 */
public class MinimumKnightMoves {
    public int minKnightMoves(int x, int y) {
        int[][] offsets = {{1, 2}, {2, 1}, {2, -1}, {1, -2},
                {-1, -2}, {-2, -1}, {-2, 1}, {-1, 2}};
        Deque<int[]> originQueue = new LinkedList<>();
        originQueue.addLast(new int[]{0, 0, 0});
        Map<String, Integer> originDistance = new HashMap<>();
        originDistance.put("0,0", 0);

        Deque<int[]> targetQueue = new LinkedList<>();
        targetQueue.addLast(new int[]{x, y, 0});
        Map<String, Integer> targetDistance = new HashMap<>();
        targetDistance.put(x + "," + y, 0);

        while (true) {
            int[] origin = originQueue.removeFirst();
            String originXY = origin[0] + "," + origin[1];
            if (targetDistance.containsKey(originXY)) {
                return origin[2] + targetDistance.get(originXY);
            }

            int[] target = targetQueue.removeFirst();
            String targetXY = target[0] + "," + target[1];
            if (originDistance.containsKey(targetXY)) {
                return target[2] + originDistance.get(targetXY);
            }

            for (int[] offset : offsets) {
                // expand the circle of origin
                int[] nextOrigin = new int[]{origin[0] + offset[0], origin[1] + offset[1]};
                String nextOriginXY = nextOrigin[0] + "," + nextOrigin[1];
                if (!originDistance.containsKey(nextOriginXY)) {
                    originQueue.addLast(new int[]{nextOrigin[0], nextOrigin[1], origin[2] + 1});
                    originDistance.put(nextOriginXY, origin[2] + 1);
                }

                // expand the circle of target
                int[] nextTarget = new int[]{target[0] + offset[0], target[1] + offset[1]};
                String nextTargetXY = nextTarget[0] + "," + nextTarget[1];
                if (!targetDistance.containsKey(nextTargetXY)) {
                    targetQueue.addLast(new int[]{nextTarget[0], nextTarget[1], target[2] + 1});
                    targetDistance.put(nextTargetXY, target[2] + 1);
                }
            }
        }
    }
}
