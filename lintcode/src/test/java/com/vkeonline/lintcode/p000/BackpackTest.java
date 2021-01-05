package com.vkeonline.lintcode.p000;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackpackTest {
    Backpack1 backpack = new Backpack1() ;

    @Test
    void backPack() {
        int[] input = {3,4,8,5} ;
        int size=10 ;
        int expected =  9 ;

        assertEquals(expected, backpack.backPack(size, input));
    }
}