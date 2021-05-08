package com.vkeonline.leetcode.p1500;

import java.util.Arrays;

/**
 * Leetcode: 1564. Put Boxes Into the Warehouse I
 * @author csgear
 */
public class BoxesInWarehouseI {
    public int maxBoxesInWarehouse(int[] boxes, int[] warehouse) {
        for (int i = 1; i < warehouse.length ; i++) {
            warehouse[i] = Math.min(warehouse[i], warehouse[i-1]) ;
        }
        Arrays.sort(boxes) ;
        int count = 0 ;
        for (int i = warehouse.length - 1 ; i >= 0 ; i--) {
            if(count < boxes.length && boxes[count] <= warehouse[i]) {
                count++ ;
            }
        }
        return count ;
    }
}
