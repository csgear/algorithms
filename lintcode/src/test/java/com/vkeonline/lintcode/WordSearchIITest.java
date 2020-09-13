package com.vkeonline.lintcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class WordSearchIITest {
    @Test
    void testWordSearch() {
        WordSearchII wordSearchII = new WordSearchII();
        char[][] board = {{'d', 'o', 'a', 'f'}, {'a', 'g', 'a', 'i'}, {'d', 'c', 'a', 'n'}};
        String[] words = {"dog", "dad", "dgdg", "can", "again"};
        System.out.println(wordSearchII.wordSearchII(board, Arrays.asList(words))) ;
    }
}