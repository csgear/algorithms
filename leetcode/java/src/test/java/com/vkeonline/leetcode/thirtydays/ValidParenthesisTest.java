package com.vkeonline.leetcode.thirtydays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesisTest {
    static ValidParenthesis vps = new ValidParenthesis() ;

    @Test
    void checkValidString() {
        assertTrue(vps.checkValidString("((*)"));
    }
}