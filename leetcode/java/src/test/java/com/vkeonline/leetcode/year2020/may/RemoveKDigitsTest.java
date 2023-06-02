package com.vkeonline.leetcode.year2020.may;

import com.vkeonline.leetcode.p400.RemoveKDigits;
import org.junit.jupiter.api.Test;

class RemoveKDigitsTest {
    RemoveKDigits removeKDigits = new RemoveKDigits() ;

    @Test
    void removeKdigits() {
        String num = "10200" ;
        int k = 1 ;

        System.out.println((removeKDigits.removeKdigits(num, k)));
    }
}