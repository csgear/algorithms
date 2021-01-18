package com.vkeonline.lintcode.p300;

import com.vkeonline.lintcode.common.Interval;

import java.util.Arrays;
import java.util.List;

/**
 * lint code: 391. Number of Airplanes in the Sky
 *
 * @author csgear
 */
public class NumberPlanesSky {
    /**
     * @param airplanes: An interval array
     * @return Count of airplanes are in the sky.
     */
    public int countOfAirplanes(List<Interval> airplanes) {
        if (airplanes == null || airplanes.size() == 0) {
            return 0;
        }
        int n = airplanes.size();
        int[] start = new int[n];
        int[] end = new int[n];
        for (int i = 0; i < n; i++) {
            start[i] = airplanes.get(i).start;
            end[i] = airplanes.get(i).end;
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int counter = 0;
        int ans = 0;
        for (int i = 0, j = 0; i < n; ) {
            if (start[i] < end[j]) {
                counter++;
                ans = Math.max(ans, counter);
                i++;
            } else {
                counter--;
                j++;
            }
        }
        return ans;
    }
}
