package com.vkeonline.leetcode.year2021.jan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeautifulArrangementTest {

    @Test
    void countArrangement() {
        BeautifulArrangement beautifulArrangement = new BeautifulArrangement() ;

        int n = 3 ;
        int expected = 3 ;

        assertEquals(expected, beautifulArrangement.countArrangement(n));
    }
}