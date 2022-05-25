package com.vkeonline.leetcode.p000;

/**
 * Leetcode [H]: 4. Median of Two Sorted Arrays
 *
 * @author csgear
 */
public class FindMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int x = nums1.length;
        int y = nums2.length;

        if (x > y) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int low = 0;
        int high = x;

        while (low <= high) {
            int divideX = low + (high - low) / 2;
            int divideY = (x + y + 1) / 2 - divideX;
            double maxLeftX = (divideX == 0 ? Integer.MIN_VALUE : nums1[divideX - 1]);
            double minRightX = (divideX == x ? Integer.MAX_VALUE : nums1[divideX]);

            double maxLeftY = (divideY == 0 ? Integer.MIN_VALUE : nums2[divideY - 1]);
            double minRightY = (divideY == y ? Integer.MAX_VALUE : nums2[divideY]);

            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
                if ((x + y) % 2 == 0) {
                    return (Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2.0;
                } else {
                    return Math.max(maxLeftX, maxLeftY);
                }
            } else if (maxLeftX > minRightY) {
                high = divideX - 1;
            } else {
                low = divideX + 1;
            }
        }
        return 0;
    }
}
