package com.vkeonline.leetcode.p1300;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ReduceArraySizeTest {

    @Test
    void minSetSize() {
        int[] arr = {3,3,3,3,5,5,5,2,2,7} ;
        int expected = 2 ;
        ReduceArraySize reduceArraySize = new ReduceArraySize() ;
        assertEquals(expected, reduceArraySize.minSetSize(arr));
    }
}
