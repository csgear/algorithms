package com.vkeonline.lintcode.p500;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversPairsTest {
    ReversPairs reversPairs = new ReversPairs() ;

    @Test
    void reversePairs() {
        int[] A = {2, 4, 1, 3, 5} ;
        int expected = 3 ;
        assertEquals(expected, reversPairs.reversePairs(A));
    }
}