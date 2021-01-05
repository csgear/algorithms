package com.vkeonline.lintcode.p100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {
    ValidAnagram validAnagram = new ValidAnagram() ;

    @Test
    void anagram() {
        String s = "ab", t = "ab" ;
        boolean expected = true ;
        assertEquals(expected, validAnagram.anagram(s, t));
    }
}