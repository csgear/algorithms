package com.vkeonline.leetcode.year2020.sept;

import org.junit.jupiter.api.Test;

class MaxXORArrayTest {

    @Test
    void testMaxXOR() {
        MaxXORArray maxXORArray = new MaxXORArray() ;

        int[] nums =  {3, 10, 5, 25, 2, 8} ;

        System.out.println(maxXORArray.findMaximumXOR(nums));
    }

}