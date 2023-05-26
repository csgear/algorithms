package com.vkeonline.leetcode.p000;

/**
 * Leetcode [E]: 26. Remove Duplicates from Sorted Array
 * @author csgear
 */
public class RemoveDupsSortedArray {
    public int removeDuplicates(int[] nums) {
        // write your code here
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int size = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[size]) {
                nums[++size] = nums[i];
            }
        }
        return size + 1;
    }
}
