package com.vkeonline.lintcode;

/**
 * Lintcode: #100
 */
public class RemoveDuplicatesFromSortedArray {


    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0 ;

        int curr = 0 ;

        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i] != nums[curr]) {
                nums[curr++] = nums[i] ;
            }
        }

        return curr ;
    }
}
