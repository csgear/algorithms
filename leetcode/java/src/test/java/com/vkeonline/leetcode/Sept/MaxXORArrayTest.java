package com.vkeonline.leetcode.Sept;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxXORArrayTest {

    @Test
    void testMaxXOR() {
        MaxXORArray maxXORArray = new MaxXORArray() ;

        int[] nums =  {3, 10, 5, 25, 2, 8} ;

        System.out.println(maxXORArray.findMaximumXOR(nums));
    }

}