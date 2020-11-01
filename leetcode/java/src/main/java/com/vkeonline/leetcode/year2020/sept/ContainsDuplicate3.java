package com.vkeonline.leetcode.year2020.sept;

import java.util.TreeSet;

/**
 * @author csgear
 */
public class ContainsDuplicate3 {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {

        int left = 0, right;

        while(left < nums.length) {
            right = left + 1 ;
            while(right < nums.length) {
                if(right -left <= k && Math.abs( (long) nums[left] - (long) nums[right]) <= t) {
                    return true ;
                }
                right++ ;
            }
            left++ ;
        }
        return false ;
    }

    public boolean containsNearbyAlmostDuplicateWithSet(int[] nums, int k, int t) {
        if(nums == null || nums.length == 0) {
            return false ;
        }

        // sliding window of size k
        TreeSet<Integer> set = new TreeSet<>() ;

        for (int i = 0; i < nums.length; i++) {
            Integer ceil = set.ceiling(nums[i]) ;
            if(ceil != null && Long.valueOf(ceil) - (long) nums[i] <= t) {
                return true ;
            }
            Integer floor = set.floor(nums[i]) ;
            if(floor != null && (long) nums[i] - Long.valueOf(floor) <= t) {
                return true ;
            }

            if(i >= k) {
                set.remove(nums[i-k]) ;
            }
        }

        return false ;
    }
}
