package com.vkeonline.lintcode.p1300;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KDistinctSubstringTest {

    KDistinctSubstring kDistinctSubstring = new KDistinctSubstring() ;
    @Test
    void kDistinctCharacters() {

        String s = "bkacsrgjkynenkwbfaeblmbjfjshojryawvsuftmqftkjqnsjfhvbsddwiwmifhphftkckkedzotkbiplqjsgdyqgjnclwjqxbbc" ;
        int k = 2 ;
        int expected = 4947 ;

        assertEquals(expected, kDistinctSubstring.kDistinctCharacters(s, k));
    }
}