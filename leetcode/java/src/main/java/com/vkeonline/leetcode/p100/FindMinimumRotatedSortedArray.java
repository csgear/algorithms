package com.vkeonline.leetcode.p100;

/**
 * Leetcode [M]: 153. Find Minimum in Rotated Sorted Array
 * @author csgear
 */
public class FindMinimumRotatedSortedArray {
    public int findMin(int[] nums) {
        int start = 0, end = nums.length - 1, middle ;
        int result = Integer.MAX_VALUE ;

        while(start <= end) {
            middle = start + (end - start) / 2 ;
           if(nums[middle] < nums[end]) {
               end = middle - 1 ;
           }
           else {
               start = middle + 1 ;
           }
           result = Math.min(nums[middle], result) ;
        }

        return result ;
    }

}
