package com.vkeonline.leetcode.p1700;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Leetcode [E]: 1710: Maximum Units on a Truck
 * @author csgear
 */
public class MaximumUnitsOnTruck {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        PriorityQueue<int[]> queue = new PriorityQueue<>(
                (a,b) -> b[1] - a[1]
        ) ;
        queue.addAll(Arrays.asList(boxTypes)) ;

        int unitCount = 0 ;
        while (!queue.isEmpty()) {
            int[]  top = queue.poll() ;
            int boxCount = Math.min(top[0], truckSize) ;
            unitCount += boxCount * top[1] ;
            truckSize -= boxCount ;
            if(truckSize == 0) {
                break;
            }
        }

        return unitCount ;

    }
}
