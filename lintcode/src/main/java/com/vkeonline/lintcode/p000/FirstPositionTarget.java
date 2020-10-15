package com.vkeonline.lintcode.p000;

/**
 * lint code: 14. First Position of Target
 * @author csgear
 */
public class FirstPositionTarget {
    public int binarySearch(int[] nums, int target) {
        if( nums == null || nums.length == 0) {
            return -1 ;
        }
        int left = 0, right = nums.length - 1 ;

        while(left < right) {
            int mid = left + (right - left) / 2 ;
            if(nums[mid] < target ) {
                left = mid + 1 ;
            }
            else {
                right = mid ;
            }
        }

        return nums[left] == target ? left : -1 ;
    }
}
