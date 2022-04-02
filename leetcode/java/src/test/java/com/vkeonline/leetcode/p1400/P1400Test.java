package com.vkeonline.leetcode.p1400;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P1400Test {

    @Test
    void minRemoveToMakeValid() {
        String s = "lee(t(c)o)de)";
        String expected = "lee(t(c)o)de";
        MinimumRemove minimumRemove = new MinimumRemove();
        assertEquals(expected, minimumRemove.minRemoveToMakeValid(s));
    }
}