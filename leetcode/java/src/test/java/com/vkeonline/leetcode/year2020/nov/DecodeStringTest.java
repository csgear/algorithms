package com.vkeonline.leetcode.year2020.nov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodeStringTest {

    @Test
    void decodeString() {

        String input = "3[2[ad]3[pf]]xyz" ;
        String output =  "adadpfpfpfadadpfpfpfadadpfpfpfxyz" ;

        DecodeString decodeString = new DecodeString() ;
        assertEquals(output, decodeString.decodeString(input));
    }
}