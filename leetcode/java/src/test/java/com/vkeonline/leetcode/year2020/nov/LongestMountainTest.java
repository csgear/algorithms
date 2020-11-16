package com.vkeonline.leetcode.year2020.nov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestMountainTest {

    @Test
    void longestMountain() {
        int[] data = {2,1,4,7,3,2,5} ;
        LongestMountain longestMountain = new LongestMountain() ;
        int result = 5 ;
        assertEquals(result, longestMountain.longestMountain(data));
    }
}