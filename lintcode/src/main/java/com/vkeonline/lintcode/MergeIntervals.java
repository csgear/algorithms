package com.vkeonline.lintcode;

import com.vkeonline.lintcode.common.Interval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Lintcode: #156
 */
public class MergeIntervals {


    public List<Interval> merge(List<Interval> intervals) {
        if (intervals == null || intervals.size() <= 1) {
            return intervals;
        }

        Collections.sort(intervals, (i1, i2) -> i1.start - i2.start);

        List<Interval> result = new ArrayList<>();

        Interval last = intervals.get(0);

        for (int i = 1; i < intervals.size(); i++) {
            Interval curr = intervals.get(i);
            if (curr.start <= last.end) {
                last.end = Math.max(curr.end, last.end);
            } else {
                result.add(last);
                last = curr;
            }
        }

        // Note: We need to add the last element here
        result.add(last);

        return result;
    }

}
