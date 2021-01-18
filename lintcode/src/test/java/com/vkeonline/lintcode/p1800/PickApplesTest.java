package com.vkeonline.lintcode.p1800;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author csgear
 */
class PickApplesTest {
    PickApples pickApples = new PickApples() ;
    @Test
    void pickApples() {
        int[] A = {6, 1, 4, 6, 3, 2, 7, 4} ;
        int K = 3 ;
        int L = 2 ;
        int expected = 24 ;
        assertEquals(expected, pickApples.pickApples(A, K, L));
    }
}