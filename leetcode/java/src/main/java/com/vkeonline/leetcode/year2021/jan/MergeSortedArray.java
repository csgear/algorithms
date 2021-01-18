package com.vkeonline.leetcode.year2021.jan;

/**
 * @author csgear
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int length = m + n;
        while (n > 0) {
            nums1[--length] = (m == 0 || nums1[m - 1] < nums2[n - 1] ? nums2[--n] : nums1[--m]);
        }
    }
}
