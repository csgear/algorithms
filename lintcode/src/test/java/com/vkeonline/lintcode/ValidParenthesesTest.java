package com.vkeonline.lintcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {
    ValidParentheses validParentheses = new ValidParentheses() ;

    @Test
    void isValidParentheses() {
        assertFalse(validParentheses.isValidParentheses("([)])"));
        assertTrue(validParentheses.isValidParentheses("()"));
    }
}