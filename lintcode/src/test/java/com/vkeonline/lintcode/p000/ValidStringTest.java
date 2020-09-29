package com.vkeonline.lintcode.p000;

import com.vkeonline.lintcode.ValidString;
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