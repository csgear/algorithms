package com.vkeonline.leetcode.year2020.nov;

import com.vkeonline.leetcode.p000.MergeIntervals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MergeIntervalsTest {

    @Test
    void testMerge() {
        MergeIntervals mergeIntervals = new MergeIntervals();

        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};

        int[][] expected = {{1,6},{8,10},{15,18}} ;

        int[][] result = mergeIntervals.merge(intervals) ;

        for (int i = 0; i < expected.length; i++) {
            assertArrayEquals(expected[i], result[i]);
        }

    }

}