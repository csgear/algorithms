package com.vkeonline.leetcode.oct;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveCoveredIntervalsTest {

    @Test
    void removeCoveredIntervals() {
        int[][] intervals = {{3,10},{4,10},{5,11}} ;
        RemoveCoveredIntervals removeCoveredIntervals = new RemoveCoveredIntervals() ;

        System.out.println(removeCoveredIntervals.removeCoveredIntervals(intervals)) ;
    }
}