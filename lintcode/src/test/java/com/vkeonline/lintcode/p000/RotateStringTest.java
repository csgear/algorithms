package com.vkeonline.lintcode.p000;

import com.vkeonline.lintcode.RotateString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateStringTest {
    RotateString rotateString = new RotateString();

    @Test
    void rotateString() {
        char[] str = "abcdefg".toCharArray();
        rotateString.rotateString(str, 3);
        assertArrayEquals("efgabcd".toCharArray(), str);
    }
}
