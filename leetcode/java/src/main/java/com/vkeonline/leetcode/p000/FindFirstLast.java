package com.vkeonline.leetcode.p000;

/**
 * Leetcode [M]: 34. Find First and Last Position of Element in Sorted Array
 * @author csgear
 */
public class FindFirstLast {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[] {-1, -1} ;

        result[0] = binarySearch(nums, target, true) ;
        result[1] = binarySearch(nums, target, false) - 1 ;

        return result ;
    }

    public int binarySearch(int[] nums, int target, boolean lower) {
        int left = 0, right = nums.length - 1;
        int ans = nums.length;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target || (lower && nums[mid] >= target)) {
                right = mid - 1;
                ans = mid;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

}
