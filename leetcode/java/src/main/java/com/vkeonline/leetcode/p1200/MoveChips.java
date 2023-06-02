package com.vkeonline.leetcode.p1200;

/**
 * Leetcode [E]: 1217. Minimum Cost to Move Chips to The Same Position
 * @author csgear
 */
public class MoveChips {
    public int minCostToMoveChips(int[] position) {
        int even = 0;
        int odd = 0;

        for (int pos : position) {
            if (pos % 2 == 0) {
                ++even;
            }
            else {
                ++odd;
            }
        }

        return Math.min (even, odd);
    }
}
