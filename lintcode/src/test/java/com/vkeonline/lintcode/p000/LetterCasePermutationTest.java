package com.vkeonline.lintcode.p000;

import com.vkeonline.lintcode.p1000.LetterCasePermutation;
import org.junit.jupiter.api.Test;

import java.util.List;

class LetterCasePermutationTest {
    LetterCasePermutation letterCasePermutation = new LetterCasePermutation() ;

    @Test
    void letterCasePermutation() {
        String S = "a1b2" ;
        List<String> result = letterCasePermutation.letterCasePermutation(S) ;
        result.stream().map(str -> str + " ").forEach(System.out::print);
    }
}