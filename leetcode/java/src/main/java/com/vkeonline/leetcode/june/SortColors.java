package com.vkeonline.leetcode.june;

/**
 * @author csgear
 */
public class SortColors {
    public void sortColors(int[] nums) {
        if (nums == null) {
            return;
        }
        int left = 0, i = 0, right = nums.length - 1;
        while (i <= right) {
            if (nums[i] == 0) {
                nums[i] = nums[left];
                nums[left] = 0;
                left++;
                i++;
            } else if (nums[i] == 1) {
                i++;
            } else {
                nums[i] = nums[right];
                nums[right] = 2;
                right--;
            }
        }
    }
}
