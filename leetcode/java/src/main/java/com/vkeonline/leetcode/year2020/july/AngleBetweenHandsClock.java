package com.vkeonline.leetcode.year2020.july;

/**
 * @author csgear
 */
public class AngleBetweenHandsClock {
    public double angleClock(int hour, int minutes) {
        double hourDegree = hour * 30 % 360 + minutes * 0.5;
        double minuteDegree = minutes * 6;

        double answer = Math.abs(minuteDegree - hourDegree);

        return Math.min(answer, 360 - answer);
    }
}
