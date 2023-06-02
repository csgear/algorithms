package com.vkeonline.leetcode.year2021.jan;

import com.vkeonline.leetcode.p1600.MostCompetitiveSubsequence;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MostCompetitiveSubsequenceTest {
    MostCompetitiveSubsequence mostCompetitiveSubsequence = new MostCompetitiveSubsequence() ;
    @Test
    void mostCompetitive() {
        int[] nums = {2,4,3,3,5,4,9,6} ;
        int  k = 4 ;
        int[] expected = {2,3,3,4} ;
        assertArrayEquals(expected, mostCompetitiveSubsequence.mostCompetitive(nums, k));
    }
}