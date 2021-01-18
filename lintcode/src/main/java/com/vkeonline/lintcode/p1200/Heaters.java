package com.vkeonline.lintcode.p1200;

import java.util.Arrays;

/**
 * Lint code: 1219. Heaters
 * @author csgear
 */
public class Heaters {

    /**
     * N Log N  solution for sorting, and O(N) using 2 pointers
     * @return minimum radius
     */
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);

        int i = 0, res = 0;
        for (int house : houses) {
            while (i < heaters.length - 1 && heaters[i] + heaters[i + 1] <= house * 2) {
                i++;
            }
            res = Math.max(res, Math.abs(heaters[i] - house));
        }

        return res;
    }

    /**
     * N log N solution
     */
    public int findRadiusWithBinarySearch(int[] houses, int[] heaters) {
        int result = 0;
        Arrays.sort(heaters);
        int j = 0;
        for (int house : houses) {
            int l = 0;
            int r = heaters.length - 1;

            while (l + 1 < r) {
                int mid = l + (r - l) / 2;

                if (heaters[mid] < house) {
                    l = mid;
                } else {
                    r = mid;
                }
            }
            int minDis = Math.min(Math.abs(house - heaters[l]), Math.abs(house - heaters[r]));
            result = Math.max(result, minDis);
        }
        return result;
    }
}
