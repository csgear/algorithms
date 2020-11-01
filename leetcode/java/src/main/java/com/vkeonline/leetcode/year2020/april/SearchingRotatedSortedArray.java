package com.vkeonline.leetcode.year2020.april;

/**
 * @author csgear
 */
public class SearchingRotatedSortedArray {
    public int Search(int[] nums, int target) {
        return search(nums, 0, nums.length -1, target) ;
    }

    private static int search(int[] nums, int l, int h, int key) {
        if (l > h) {
            return -1;
        }
        int mid = (l+h)/2;
        if (nums[mid] == key)
        {
            return mid;
        }

        /* If arr[l...mid] first subarray is sorted */
        if (nums[l] <= nums[mid])
        {
            /* As this subarray is sorted, we
               can quickly check if key lies in
               half or other half */
            if (key >= nums[l] && key <= nums[mid])
            {
                return search(nums, l, mid-1, key);
            }
            /*If key not lies in first half subarray,
           Divide other half  into two subarrays,
           such that we can quickly check if key lies
           in other half */
            return search(nums, mid+1, h, key);
        }

        /* If arr[l..mid] first subarray is not sorted,
           then arr[mid... h] must be sorted subarry*/
        if (key >= nums[mid] && key <= nums[h])
        {
            return search(nums, mid+1, h, key);
        }

        return search(nums, l, mid-1, key);
    }
}
