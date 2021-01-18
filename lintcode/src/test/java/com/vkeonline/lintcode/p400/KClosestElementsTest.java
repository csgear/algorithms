package com.vkeonline.lintcode.p400;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KClosestElementsTest {

    @Test
    void kClosestNumbers() {
        KClosestElements kClosestElements = new KClosestElements() ;
        int[] data = {1, 4, 6, 8} ;
        int target = 3, k = 3 ;
        int[] expected = {4, 1, 6} ;
        assertArrayEquals(expected, kClosestElements.kClosestNumbers(data, target, k)) ;
    }

}