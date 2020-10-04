package com.vkeonline.leetcode.oct;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author csgear
 */
public class RemoveCoveredIntervals {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int[] current = {-1, -1} ;
        int overlaps = 0 ;

        for(int[] interval: intervals) {
            if(current[0] <= interval[0] && current[1] >= interval[1]) {
                overlaps++ ;
            }
            else {
                if(current[0] >= interval[0] && current[0] <= interval[1]) {
                    overlaps++ ;
                }
                current = interval ;
            }
        }

        return intervals.length - overlaps ;
    }
}
