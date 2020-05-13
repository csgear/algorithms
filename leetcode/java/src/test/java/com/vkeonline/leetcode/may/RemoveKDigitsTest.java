package com.vkeonline.leetcode.may;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveKDigitsTest {
    RemoveKDigits removeKDigits = new RemoveKDigits() ;

    @Test
    void removeKdigits() {
        String num = "10200" ;
        int k = 1 ;

        System.out.println((removeKDigits.removeKdigits(num, k)));
    }
}