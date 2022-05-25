package com.vkeonline.leetcode.p1000;

import java.util.Map;
import java.util.TreeMap;


/**
 * Leetcode [M]: 1094. Car Pooling
 * @author csgear
 */
public class CarPooling {
    public boolean carPooling(int[][] trips, int capacity) {
        Map<Integer, Integer> timestamp = new TreeMap<>();
        for (int[] trip : trips) {
            int startPassenger = timestamp.getOrDefault(trip[1], 0) + trip[0];
            timestamp.put(trip[1], startPassenger);
            int endPassenger = timestamp.getOrDefault(trip[2], 0) - trip[0];
            timestamp.put(trip[2], endPassenger);
        }

        int usedCapacity = 0;
        for (int passengerChange : timestamp.values()) {
            usedCapacity += passengerChange;
            if (usedCapacity > capacity) {
                return false;
            }
        }
        return true;
    }
}
