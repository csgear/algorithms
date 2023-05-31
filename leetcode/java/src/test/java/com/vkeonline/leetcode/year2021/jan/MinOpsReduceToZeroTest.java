package com.vkeonline.leetcode.year2021.jan;

import com.vkeonline.leetcode.p1600.MinOpsReduceToZero;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinOpsReduceToZeroTest {
    MinOpsReduceToZero minOpsReduceToZero = new MinOpsReduceToZero() ;

    @Test
    void minOperations() {
        int[] nums = {1,1,4,2,3} ;
        int x = 5 ;
        int expected = 2 ;
        assertEquals(expected, minOpsReduceToZero.minOperations(nums, x));
    }
}