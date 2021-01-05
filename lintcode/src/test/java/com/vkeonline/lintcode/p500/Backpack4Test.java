package com.vkeonline.lintcode.p500;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Backpack4Test {
    Backpack4 backpack4 = new Backpack4() ;

    @Test
    void backPackIV() {
        int[] nums = {2,3,6,7} ;
        int target = 7 ;
        int expected = 2 ;

        assertEquals(expected, backpack4.backPackIV(nums, target));
    }
}