package com.vkeonline.leetcode.p100;

public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            int mid = start + (end - start)/2;
            if((mid == 0 || nums[mid-1] < nums[mid])
                    && (mid == nums.length - 1 || nums[mid] > nums[mid+1])) {
                return mid;
            }

            if(mid > 0 && nums[mid-1] > nums[mid]) {
                end = mid - 1;
            }
            else if(mid < nums.length && nums[mid+1] > nums[mid]) {
                start = mid + 1;
            }
        }
        return -1;
    }
}
