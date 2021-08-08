package com.vkeonline.leetcode.year2021.jan;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.vkeonline.leetcode.p500.BeautifulArrangement;
import org.junit.jupiter.api.Test;

class BeautifulArrangementTest {

    @Test
    void countArrangement() {
        BeautifulArrangement beautifulArrangement = new BeautifulArrangement() ;

        int n = 3 ;
        int expected = 3 ;

        assertEquals(expected, beautifulArrangement.countArrangement(n));
    }
}
