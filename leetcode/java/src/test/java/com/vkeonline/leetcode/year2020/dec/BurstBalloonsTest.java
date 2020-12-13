package com.vkeonline.leetcode.year2020.dec;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BurstBalloonsTest {

    @Test
    void maxCoins() {
        BurstBalloons burstBalloons = new BurstBalloons() ;
        int[] balloons = {3,1,5,8} ;
        int result = 167 ;
        assertEquals(167, burstBalloons.maxCoins(balloons)) ;
    }
}