package com.vkeonline.lintcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LetterCasePermutationTest {
    LetterCasePermutation letterCasePermutation = new LetterCasePermutation() ;

    @Test
    void letterCasePermutation() {
        String S = "a1b2" ;
        List<String> result = letterCasePermutation.letterCasePermutation(S) ;
        result.stream().map(str -> str + " ").forEach(System.out::print);
    }
}