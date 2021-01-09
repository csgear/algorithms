package com.vkeonline.leetcode.year2020.oct;

import org.junit.jupiter.api.Test;

class RemoveDupLettersTest {

    @Test
    void removeDuplicateLetters() {
        RemoveDupLetters removeDupLetters = new RemoveDupLetters() ;

        String s = "cbacdcbc" ;

        System.out.println(removeDupLetters.removeDuplicateLetters(s));
    }
}