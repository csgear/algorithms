package com.vkeonline.lintcode.p000;

import com.vkeonline.lintcode.p1900.SquaresSortedArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquaresSortedArrayTest {

    @Test
    void squareArray() {
        int[] nums = {-4,-1,0,3,10} ;
        SquaresSortedArray sa = new SquaresSortedArray() ;
        assertArrayEquals(new int[] {0,1,9,16,100}, sa.SquareArray(nums)) ;
    }
}