package com.vkeonline.lintcode.p1800;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrumpyOwnerTest {
    GrumpyOwner grumpyOwner = new GrumpyOwner() ;

    @Test
    void maxSatisfied() {
        int[] customers = {1,0,1,2,1,1,7,5} ;
        int[] grumpy = {0,1,0,1,0,1,0,1} ;
        int X = 3 ;
        int expected = 16 ;
        assertEquals(expected, grumpyOwner.maxSatisfied(customers, grumpy, X));
    }
}