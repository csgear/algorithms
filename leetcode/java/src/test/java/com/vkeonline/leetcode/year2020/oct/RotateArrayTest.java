package com.vkeonline.leetcode.year2020.oct;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateArrayTest {

    @Test
    void rotate() {
        int[] nums = {1,2,3,4,5,6,7} ;
        int k = 3 ;
        int[] expected = {5,6,7,1,2,3,4} ;

        RotateArray rotateArray = new RotateArray() ;

        rotateArray.rotate(nums, k);

        assertArrayEquals(expected, nums);
    }
}