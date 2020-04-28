package com.vkeonline.lintcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountAndSayTest {
    CountAndSay countAndSay = new CountAndSay() ;
    @Test
    void countAndSay() {
        assertEquals("111221", countAndSay.countAndSay(5));
    }
}