package com.vkeonline.leetcode.p2400;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author csgear
 */
class P2400Test {

    @Test
    void testUnequalTriplets() {
        NumberUnequalTriplets numberUnequalTriplets = new NumberUnequalTriplets() ;
        int[] nums = {4,4,2,4,3} ;
        int expected = 3 ;
    }

    @Test
    void oddString() {
        OddStringDifference oddStringDifference = new OddStringDifference() ;
        String[] words = {"adc","wzy","abc"} ;
        String expected = "abc" ;
        assertEquals(expected, oddStringDifference.oddString(words));

    }
}