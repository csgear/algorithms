
package com.vkeonline.leetcode.p700;

import java.util.TreeMap;

/**
 * Leetcode [M]: 729. My Calendar I
 * @author csgear
 */
public class MyCalendar1 {
    TreeMap<Integer, Integer> calendar;

    public boolean book(int start, int end) {
        Integer prev = calendar.floorKey(start) ;
        Integer next = calendar.ceilingKey(start) ;
        if( (prev == null || calendar.get(prev) <= start) &&
                (next == null || calendar.get(next) >= next)) {
            calendar.put(start, end) ;
            return true ;
        }
        return false ;
    }
}
