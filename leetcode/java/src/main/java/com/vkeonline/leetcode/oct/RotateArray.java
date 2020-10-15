package com.vkeonline.leetcode.oct;

/**
 * @author csgear
 */
public class RotateArray {
    public void rotate(int[] nums, int k) {
        int n = nums.length ;
        k = k % n ;
        reverse(nums, 0, n - k - 1) ;
        reverse(nums, n - k, n - 1) ;
        reverse(nums, 0, n - 1) ;
    }

    private void reverse(int[] nums, int start, int end) {
        for (int p = start, q = end; p < q; p++, q--) {
            int temp = nums[p];
            nums[p] = nums[q];
            nums[q] = temp;
        }
    }
}
