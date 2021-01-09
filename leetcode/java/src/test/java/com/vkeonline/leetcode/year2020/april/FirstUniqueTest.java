package com.vkeonline.leetcode.year2020.april;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstUniqueTest {

    @Test
    void showFirstUnique() {
        int[] nums = {7,7,7,7,7,7} ;
        FirstUnique firstUnique = new FirstUnique(nums) ;
        assertEquals(-1, firstUnique.showFirstUnique()) ;
    }
}