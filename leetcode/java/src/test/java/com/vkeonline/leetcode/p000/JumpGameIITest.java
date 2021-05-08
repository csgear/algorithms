package com.vkeonline.leetcode.p000;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpGameIITest {

    @Test
    void jump() {
        JumpGameII jumpGameII = new JumpGameII() ;
        int[] nums = {2,3,1,1,4} ;
        int expected = 2 ;
        assertEquals(expected, jumpGameII.jump(nums));
    }
}