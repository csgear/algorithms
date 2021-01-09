package com.vkeonline.leetcode.year2020.may;

/**
 * @author csgear
 */
public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        int left = 1, right = num;
        while (left <= right) {
            // to avoid overflow incase (left+right)>2147483647
            int mid = left + (right - left) / 2;
            int res = num / mid, remain = num % mid;
            if (res == mid && remain == 0) {
                // check if mid * mid == num
                return true;
            }
            if (res > mid) {
                // mid is small -> go right to increase mid
                left = mid + 1;
            } else {
                // mid is large -> to left to decrease mid
                right = mid - 1;
            }
        }
        return false;
    }
}
