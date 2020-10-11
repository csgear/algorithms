package com.vkeonline.leetcode.oct;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDupLettersTest {

    @Test
    void removeDuplicateLetters() {
        RemoveDupLetters removeDupLetters = new RemoveDupLetters() ;

        String s = "cbacdcbc" ;

        System.out.println(removeDupLetters.removeDuplicateLetters(s));
    }
}