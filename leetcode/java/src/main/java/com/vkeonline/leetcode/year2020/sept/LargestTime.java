package com.vkeonline.leetcode.year2020.sept;

/**
 * @author csgear
 */
public class LargestTime {
    public String largestTimeFromDigits(int[] A) {
        String res = "";
        final int length;
        length = 4;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                for (int k = 0; k < length; k++) {
                    if (i == j || j == k || i == k) {
                        continue;
                    }
                    String hour = A[i] + "" + A[j];
                    String minute = A[k] + "" + A[6 - i - j - k];
                    String time = hour + ":" + minute;
                    if (hour.compareTo("24") < 0 && minute.compareTo("60") < 0 && res.compareTo(time) < 0) {
                        res = time;
                    }
                }

            }
        }
        return res;
    }
}
