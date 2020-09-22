package com.vkeonline.leetcode.sept;

import org.junit.jupiter.api.Test;

class SequentialDigitsTest {

    @Test
    void sequentialDigits() {
        SequentialDigits sequentialDigits = new SequentialDigits() ;

        int low = 1000 ;
        int high = 13000 ;

        System.out.println(sequentialDigits.sequentialDigits(low, high)); ;
    }
}