package com.vkeonline.lintcode.p100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WoodCutTest {
    WoodCut woodCut = new WoodCut() ;
    @Test
    void woodCut() {
        int[] L = {232, 124, 456} ;
        int k = 7 ;
        int expected = 114 ;
        assertEquals(expected, woodCut.woodCut(L, k));
    }
}