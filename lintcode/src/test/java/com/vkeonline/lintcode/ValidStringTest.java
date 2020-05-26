package com.vkeonline.lintcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidStringTest {
    ValidString validString = new ValidString();
    @Test
    void isValid() {
        String s1 = "aacccbb" ;
        assertEquals("YES", validString.isValid(s1));
    }
}