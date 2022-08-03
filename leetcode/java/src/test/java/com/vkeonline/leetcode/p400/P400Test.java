package com.vkeonline.leetcode.p400;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @author csgear
 */
class P400Test {

    @Test
    void findPermutation() {
        FindPermutation findPermutation = new FindPermutation() ;
        String s = "DI" ;
        int[] expected = {2,1,3} ;
        assertArrayEquals(expected, findPermutation.findPermutation(s));
    }

    @Test
    void arrangeCoins() {
        int n = 5 ;
        int expected = 2 ;
        ArrangeCoins arrangeCoins = new ArrangeCoins() ;
        assertEquals(expected, arrangeCoins.arrangeCoins(n));
    }
}
