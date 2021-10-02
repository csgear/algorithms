package com.vkeonline.leetcode.p900;

import java.util.ArrayList;
import java.util.List;


/**
 * Leetcode [M]: 986. Interval List Intersections
 * @author csgear
 */
public class IntervalListIntersections {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> intersections = new ArrayList<>() ;
        int p1 = 0, p2 = 0 ;
        while(p1 < firstList.length && p2 < secondList.length) {
            int left = Math.max(firstList[p1][0], secondList[p2][0]) ;
            int right = Math.min(firstList[p1][1], secondList[p2][1]) ;
            if(left <= right) {
                intersections.add(new int[] {left, right}) ;
            }
            if(firstList[p1][1] >= secondList[p2][1]) {
                p2++ ;
            }
            else {
                p1++ ;
            }
        }
        return intersections.toArray(new int[intersections.size()][]) ;
    }
}
