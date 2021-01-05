package com.vkeonline.lintcode.p100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {
    RemoveElement removeElement = new RemoveElement() ;
    @Test
    void removeElement() {
        int[] input = {0,4,4,0,0,2,4,4} ;
        int value = 4 ;
        int expected = 4 ;
        assertEquals(expected, removeElement.removeElement(input, value));
    }
}