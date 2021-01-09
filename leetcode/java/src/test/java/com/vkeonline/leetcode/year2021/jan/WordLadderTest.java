package com.vkeonline.leetcode.year2021.jan;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class WordLadderTest {

    @Test
    void ladderLength() {
        WordLadder wordLadder = new WordLadder() ;

        String beginWord = "hit" ;
        String endWord = "cog" ;
        String[] wordList = {"hot","dot","dog","lot","log","cog"} ;
        int expected = 5 ;

        assertEquals(expected, wordLadder.ladderLength(beginWord, endWord, Arrays.asList(wordList)));
    }
}