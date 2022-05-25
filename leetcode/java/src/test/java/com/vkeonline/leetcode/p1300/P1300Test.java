package com.vkeonline.leetcode.p1300;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class P1300Test {

    @Test
    void minDifficulty() {
        MinimumDifficultyJobSchedule minimumDifficultyJobSchedule = new MinimumDifficultyJobSchedule() ;
        int[]  jobDifficulty = {11,111,22,222,33,333,44,444} ;
        int d = 6 ;
        int expected = 843 ;
        assertEquals(expected, minimumDifficultyJobSchedule.minDifficulty(jobDifficulty, d));
        jobDifficulty = new int[]{6, 5, 4, 3, 2, 1};
        d = 2 ;
        expected = 7 ;
        assertEquals(expected, minimumDifficultyJobSchedule.minDifficulty(jobDifficulty, d));
    }

    @Test
    void minSetSize() {
        int[] arr = {3,3,3,3,5,5,5,2,2,7} ;
        int expected = 2 ;
        ReduceArraySize reduceArraySize = new ReduceArraySize() ;
        assertEquals(expected, reduceArraySize.minSetSize(arr));
    }
}
