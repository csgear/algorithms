package com.vkeonline.leetcode.p400;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


class P400Test {

    @Test
    void findMaxConsecutiveOnes() {
        MaxConsecutiveOnesII maxConsecutiveOnesII = new MaxConsecutiveOnesII() ;
        int[] nums = {1,0,1,1,0,1} ;
        int expected = 4 ;
        assertEquals(expected, maxConsecutiveOnesII.findMaxConsecutiveOnes(nums));
    }
}
