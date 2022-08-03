package com.vkeonline.leetcode.p300;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P300Test {

    @Test
    void kthSmallest() {
        KthSmallestElementSortedMatrix kthSmallestElementSortedMatrix = new KthSmallestElementSortedMatrix();

        int[][] matrix = { { 1, 5, 9 }, { 10, 11, 13 }, { 12, 13, 15 } };
        int k = 8;

        int expected = Arrays.stream(matrix).flatMapToInt(Arrays::stream)
                .sorted().toArray()[k-1] ;

        assertEquals(expected, kthSmallestElementSortedMatrix.kthSmallestBinarySearch(
                matrix, k
        ));
    }

    @Test
    void wiggleMaxLength() {
        WiggleSubsequence wiggleSubsequence = new WiggleSubsequence();
        int[] nums = { 1, 17, 5, 10, 13, 15, 10, 5, 16, 8 };
        int expected = 7;
        assertEquals(expected, wiggleSubsequence.wiggleMaxLength(nums));
    }

    @Test
    void longestIncreasingSubsequence() {
        int[] nums = { 10, 9, 2, 5, 3, 7, 101, 18 };
        int expected = 4;
        LongestIncreasingSubsequence longestIncreasingSubsequence = new LongestIncreasingSubsequence();
        assertEquals(expected, longestIncreasingSubsequence.longestIncreasingSubsequence(nums));
    }
}
