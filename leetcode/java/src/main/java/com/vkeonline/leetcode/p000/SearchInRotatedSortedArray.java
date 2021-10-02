package com.vkeonline.leetcode.p000;

/**
 * Leetcode [M]: 34. Search in Rotated Sorted Array
 * @author csgear
 */
public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1, middle ;
        int result = -1 ;
        while(start <= end) {
            middle = start + (end - start) / 2 ;
            if(nums[middle] == target) {
                result = middle ;
                break ;
            }
            if(nums[middle] >= nums[start]) {
                if(target >= nums[start] && target < nums[middle]) {
                    end = middle - 1 ;
                }
                else {
                    start = middle + 1 ;
                }
            }
            else {
                if(target > nums[middle] && target <= nums[end]) {
                    start = middle + 1 ;
                }
                else {
                    end = middle - 1 ;
                }
            }
        }
        return result ;
    }

}
