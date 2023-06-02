package com.vkeonline.leetcode.p900;

/**
 * Leetcode [E]: 977. Squares of a Sorted Array
 * @author csgear
 */
public class SquaresSortedArray {
    public int[] sortedSquares(int[] nums) {
        if(nums == null || nums.length == 0) {
            return null ;
        }

        int[] result = new int[nums.length] ;
        int left = 0, right = nums.length - 1 ;

        for (int p = nums.length - 1; p >= 0; p--) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[p] = nums[left] * nums[left];
                left++;
            } else {
                result[p] = nums[right] * nums[right];
                right--;
            }
        }
        return result;
    }
}
