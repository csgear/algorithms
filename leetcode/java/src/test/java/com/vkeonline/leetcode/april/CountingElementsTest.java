package com.vkeonline.leetcode.april;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingElementsTest {

    @Test
    void countElements() {
        CountingElements ce = new CountingElements() ;
        int result  ;
        result = ce.countElements(new int[]{1,1,3,3,5,5,7,7});
        assertEquals(0, result);
        result = ce.countElements(new int[]{1,3,2,3,5,0}) ;
        assertEquals(3, result);
    }
}