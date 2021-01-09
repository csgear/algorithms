package com.vkeonline.leetcode.year2020.april;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContiguousArrayTest {
    static ContiguousArray ca = new ContiguousArray() ;
    @Test
    void findMaxLength() {
        int[] nums = {0,1,0} ;
        int result = ca.findMaxLength(nums) ;
        assertEquals(2, result);
    }
}