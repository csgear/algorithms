package com.vkeonline.leetcode.p000;

/**
 * Leetcode [M]: 34. Find First and Last Position of Element in Sorted Array
 * @author csgear
 */
public class FindFirstAndLast {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[] {-1, -1} ;

        result[0] = findFirstElement(nums, target) ;
        result[1] = findLastElement(nums, target) ;

        return result ;
    }

    private int findFirstElement(int[] nums, int target) {
        int index = -1 ;

        int start = 0, end = nums.length - 1, middle ;

        while(start <= end) {
            middle = start + (end - start) / 2 ;
            if(nums[middle] >= target) {
                end = middle - 1 ;
            }
            else {
                start = middle + 1 ;
            }

            if(nums[middle] == target) {
                index = middle ;
            }
        }

        return index ;
    }

    private int findLastElement(int[] nums, int target) {
        int index = -1 ;
        int start = 0, end = nums.length - 1, middle ;
        while(start <= end) {
            middle = start + (end - start) / 2 ;
            if(nums[middle] <= target) {
                start = middle + 1 ;
            }
            else {
                end = middle - 1 ;
            }

            if(nums[middle] == target) {
                index = middle ;
            }
        }
        return index ;
    }
}
