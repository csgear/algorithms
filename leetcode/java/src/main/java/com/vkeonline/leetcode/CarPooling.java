package com.vkeonline.leetcode;

/**
 * @author csgear
 * leetcode: 1094. Car Pooling
 */
public class CarPooling {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] passenger = new int[1001];
        int lastStop = 0;
        for (int[] trip : trips) {

            passenger[trip[1]] = passenger[trip[1]] + trip[0];
            passenger[trip[2]] = passenger[trip[2]] - trip[0];
            lastStop = Math.max(lastStop, trip[2]);

        }
        int passengerCount = 0;
        for (int i = 0; i < lastStop; i++) {
            passengerCount = passengerCount + passenger[i];
            if (passengerCount > capacity) {
                return false;
            }
        }
        return true;
    }
}
