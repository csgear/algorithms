package com.vkeonline.lintcode.p400;



/**
 * Lint code: 406. Minimum Size Subarray Sum
 * @author csgear
 */
public class MinimumSizeSubarraySum {
    /**
     * @param nums: an array of integers
     * @param s: an integer
     * @return an integer representing the minimum size of subarray
     */
    public int minimumSize(int[] nums, int s) {
        int result = Integer.MAX_VALUE ;

        int sum = 0 ;
        for(int left = 0, right = 0 ; right < nums.length ; right++) {
            sum += nums[right] ;
            while(sum >= s) {
                result = Math.min(result, right - left + 1) ;
                sum -= nums[left++] ;
            }
        }

        return result == Integer.MAX_VALUE ? -1 : result ;

    }
}
