package com.vkeonline.leetcode.year2020.dec;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpGame4Test {

    @Test
    void minJumps() {
        JumpGame4 jumpGame4 = new JumpGame4() ;

        int[] array = {100,-23,-23,404,100,23,23,23,3,404} ;
        int expected = 3 ;

        assertEquals(expected, jumpGame4.minJumps(array));
    }
}