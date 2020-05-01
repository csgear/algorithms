package com.vkeonline.leetcode.april;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LastStoneWeightTest {
    static LastStoneWeight lsw = new LastStoneWeight() ;

    @Test
    void lastStoneWeight() {
        int[] stones = new int[] {2,7,4,1,8,1} ;
        int result = lsw.lastStoneWeight(stones) ;
        assertEquals(1, result);
    }
}