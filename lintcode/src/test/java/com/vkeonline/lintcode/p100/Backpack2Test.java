package com.vkeonline.lintcode.p100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Backpack2Test {
    Backpack2 backpack2 = new Backpack2() ;

    @Test
    void backPackII() {
        int m = 10 ;
        int[]  A = {2, 3, 5, 7}, V = {1, 5, 2, 4} ;

        int expected = 9 ;

        assertEquals(expected, backpack2.backPackII(m, A, V));
    }
}