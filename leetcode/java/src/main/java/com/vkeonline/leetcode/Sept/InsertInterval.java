package com.vkeonline.leetcode.Sept;

import java.util.ArrayList;
import java.util.List;

/**
 * @author csgear
 */
public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int newStart = newInterval[0], newEnd = newInterval[1];
        int index = 0, n = intervals.length;
        List<int[]> output = new ArrayList<>();

        while (index < n && intervals[index][1] < newStart) {
            output.add(intervals[index]);
            index++;
        }
        while (index < n && intervals[index][0] <= newEnd) {
            newStart = Math.min(intervals[index][0], newStart);
            newEnd = Math.max(intervals[index][1], newEnd);
            index++;
        }

        output.add(new int[]{newStart, newEnd});

        while (index < n) {
            output.add(intervals[index]);
            index++;
        }

        return (output.toArray(new int[output.size()][2]));
    }
}
