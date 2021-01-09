package com.vkeonline.leetcode.p100;

import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode: 149. Max Points on a Line
 * @author csgear
 */
public class MaxPoints {
    public int maxPoints(int[][] points) {
        if (points == null || points.length == 0) {
            return 0;
        }
        Map<Double, Integer> map = new HashMap<>();
        int max = 1;
        for (int i = 0; i < points.length; i++) {
            map.clear();
            int dup = 0;
            map.put(Double.MIN_VALUE, 1);
            for (int j = i + 1; j < points.length; j++) {
                if (points[i][0] == points[j][0] && points[i][1] == points[j][1]) {
                    dup++;
                    continue;
                }
                double k = points[i][0] - points[j][0] == 0 ?
                        Integer.MAX_VALUE : 0.0 + (double) (points[i][1] - points[j][1]) / (points[i][0] - points[j][0]);
                map.put(k, map.getOrDefault(k, 1) + 1);
            }
            for (Integer count : map.values()) {
                if (count + dup > max) {
                    max = count + dup;
                }
            }
        }
        return max;
    }
}
