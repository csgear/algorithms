package com.vkeonline.leetcode.p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Leetcode [M]: 15. 3Sum
 * @author csgear
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>() ;

        Arrays.sort(nums);

        // nums in ascending order, nums[i] shall be zero or negative as the first in the tuple
        for(int i = 0 ; i < nums.length && nums[i] <=0 ; i++) {
            if(i == 0 || nums[i-1] != nums[i]) {
                twoSum(nums, i, result) ;
            }
        }

        return result ;
    }

    private void twoSum(int[] nums, int current, List<List<Integer>> result) {
        int low = current + 1, high = nums.length - 1 ;
        while(low < high) {
            int sum = nums[current] + nums[low] + nums[high];
            if(sum < 0) {
                low++ ;
            }
            else if(sum > 0) {
                high-- ;
            }
            else {
                result.add(Arrays.asList(nums[current], nums[low], nums[high])) ;
                // used only once to remove duplicated solution
                low++ ;
                high-- ;
                while (low < high && nums[low - 1] == nums[low]) {
                    low++ ;
                }
            }
        }
    }

}
