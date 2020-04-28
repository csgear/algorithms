package com.vkeonline.lintcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Lintcode: #156
 */
public class MergeIntervals {

     class Interval {
      int start, end;
      Interval(int start, int end) {
          this.start = start;
          this.end = end;
      }
  }

    public List<Interval> merge(List<Interval> intervals) {
        if (intervals == null || intervals.size() <= 1) {
            return intervals;
        }

        Collections.sort(intervals, (i1, i2) -> i1.start - i2.start) ;

        List<Interval> result = new ArrayList<Interval>();

        Interval last = intervals.get(0) ;

        for(int i = 1 ; i < intervals.size() ; i++) {
            Interval curr = intervals.get(i) ;
            if(curr.start <= last.end) {
                last.end = Math.max(curr.end, last.end) ;
            }
            else {
                result.add(last) ;
                last = curr ;
            }
        }

        result.add(last) ;

        return result ;
    }

}
