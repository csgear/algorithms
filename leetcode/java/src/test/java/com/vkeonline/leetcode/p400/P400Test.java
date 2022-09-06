package com.vkeonline.leetcode.p400;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


class P400Test {

    @Test
    void arrangeCoins() {
        int n = 5 ;
        int expected = 2 ;
        ArrangeCoins arrangeCoins = new ArrangeCoins() ;
        assertEquals(expected, arrangeCoins.arrangeCoins(n));
    }
}
