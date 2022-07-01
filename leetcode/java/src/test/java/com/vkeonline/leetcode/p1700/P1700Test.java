package com.vkeonline.leetcode.p1700;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P1700Test {

    @Test
    void maximumUnits() {
        MaximumUnitsOnTruck maximumUnitsOnTruck = new MaximumUnitsOnTruck() ;
            int[][] boxTypes = {{1,3},{2,2},{3,1}} ;
            int truckSize = 4 ;
            int expected = 8 ;
            assertEquals(expected, maximumUnitsOnTruck.maximumUnits(boxTypes, truckSize));
    }
}