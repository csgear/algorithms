package com.vkeonline.leetcode.p1000;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestStringChainTest {

    LongestStringChain longestStringChain = new LongestStringChain();

    @Test
    void longestStrChain() {
        String[] words = {"xbc", "pcxbcf", "xb", "cxbc", "pcxbc"};
        int expected = 5;

        assertEquals(expected, longestStringChain.longestStrChain(words));
    }
}