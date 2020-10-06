package com.vkeonline.lintcode.p900;

import com.vkeonline.lintcode.common.Interval;

import java.util.Collections;
import java.util.List;

/**
 * lintcode: 920. Meeting Rooms
 * @author csgear
 */
public class MeetingRooms {
    public boolean canAttendMeetings(List<Interval> intervals) {
        if(intervals == null || intervals.size() == 0) {
            return true;
        }

        intervals.sort((i1, i2) -> i1.start - i2.start) ;

        int end = intervals.get(0).end;

        for(int i = 1 ; i < intervals.size() ; i++ ) {
            if(intervals.get(i).start < end) {
                return false ;
            }
            end = Math.max(end, intervals.get(i).end) ;
        }

        return true ;
    }
}
