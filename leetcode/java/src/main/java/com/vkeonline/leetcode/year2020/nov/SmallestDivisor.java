package com.vkeonline.leetcode.year2020.nov;

/**
 * @author csgear
 */
public class SmallestDivisor {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int max = 0;
        for (int num : nums) {
            max = Math.max(num, max);
        }
        int left = 1;
        int right = max;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (isValid(nums, threshold, mid)) {
                right = mid;
            } else {
                left = mid;

            }
        }
        if (isValid(nums, threshold, left)) {
            return left;
        }
        return right;
    }

    private boolean isValid(int[] nums, int threshold, int val) {
        long sum = 0;
        for (int num : nums) {
            if (num % val == 0) {
                sum += num / val;
            } else {
                sum += num / val + 1;
            }
        }
        return sum <= threshold;
    }
}
