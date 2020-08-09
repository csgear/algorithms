package com.vkeonline.leetcode.april;

public class StringShifts {
    public String stringShift(String s, int[][] shift) {
        int cumShift = 0;
        for (int[] sh : shift) {
            if (sh[0] == 0) cumShift += sh[1];
            else cumShift -= sh[1];
        }

        cumShift = cumShift % s.length();

        String ans = "";
        if (cumShift >= 0) {
            ans = s.substring(cumShift) + s.substring(0, cumShift);
        } else {
            ans = s.substring(s.length() + cumShift) + s.substring(0, s.length() + cumShift);
        }

        return ans;
    }
}
