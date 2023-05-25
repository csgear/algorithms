package com.vkeonline.leetcode.p2400;

import java.util.Spliterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author csgear
 */
class P2400Test {

    @Test
    void oddString() {
        OddStringDifference oddStringDifference = new OddStringDifference() ;
        String[] words = {"adc","wzy","abc"} ;
        String expected = "abc" ;
        assertEquals(expected, oddStringDifference.oddString(words));

    }
}