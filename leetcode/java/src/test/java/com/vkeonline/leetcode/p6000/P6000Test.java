package com.vkeonline.leetcode.p6000;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiaojun.yang
 */
class P6000Test {

    @Test
    void testFindValueOfPartition() {
        FindValueOfPartition findValueOfPartition = new FindValueOfPartition() ;
        int[] nums = {100,1,10} ;
        int expected = 9 ;
        assertEquals(expected, findValueOfPartition.findValueOfPartition(nums));
    }

    @Test
    void testDistanceTraveled() {
        DistanceTraveled distanceTraveled = new DistanceTraveled() ;
        int mainTank = 5 ;
        int additionalTank = 10 ;
        int expected = 60 ;
        assertEquals(expected, distanceTraveled.distanceTraveled(mainTank, additionalTank));
    }
}