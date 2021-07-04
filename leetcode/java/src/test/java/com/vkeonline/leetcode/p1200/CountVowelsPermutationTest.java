package com.vkeonline.leetcode.p1200;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountVowelsPermutationTest {

    @Test
    void countVowelPermutation() {
        CountVowelsPermutation countVowelsPermutation = new CountVowelsPermutation();
        int expected = 68;
        assertEquals(expected, countVowelsPermutation.countVowelPermutation(5));
    }
}