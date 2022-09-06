package com.vkeonline.leetcode.p1600;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P1600Test {

    @Test
    void furthestBuilding() {
        FurthestBuilding furthestBuilding = new FurthestBuilding();
        int[] heights = {4, 12, 2, 7, 3, 18, 20, 3, 19};
        int bricks = 10;
        int ladders = 2;
        int expected = 7;
        assertEquals(expected, furthestBuilding.furthestBuilding(heights, bricks, ladders));
    }

    @Test
    void minPartitions() {
        DeciBinaryNumbers deciBinaryNumbers = new DeciBinaryNumbers();
        String n = "27346209830709182346";
        int expected = 9;
        assertEquals(expected, deciBinaryNumbers.minPartitions(n));
    }
}