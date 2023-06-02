package com.vkeonline.leetcode.p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Leetcode [M]: 56. Merge Intervals
 * @author csgear
 */
public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0])) ;

        int start = intervals[0][0] ;
        int end = intervals[0][1] ;

        for(int[] interval: intervals) {
            if(interval[0] <= end) {
                end = Math.max(end, interval[1]) ;
            }
            else {
                res.add(new int[] {start, end}) ;
                start = interval[0] ;
                end = interval[1] ;
            }
        }

        res.add(new int[] {start, end}) ;
        return res.toArray(new int[0][]) ;
    }
}
