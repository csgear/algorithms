package com.vkeonline.leetcode.p100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Leetcode: 163. Missing Ranges
 * @author csgear
 */
public class MissingRanges {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result = new ArrayList<>() ;

        if(nums.length == 0) {
            result.add(formatRange(lower, upper)) ;
            return result ;
        }

        if(lower < nums[0]) {
            result.add(formatRange(lower, nums[0] - 1)) ;
        }

        for(int i = 0 ; i < nums.length - 1; i++ ) {
            if(nums[i+1] - nums[i] > 1) {
                result.add(formatRange(nums[i]+1, nums[i+1] - 1)) ;
            }
        }

        if(upper > nums[nums.length - 1]) {
            result.add(formatRange(nums[nums.length-1] + 1, upper)) ;
        }

        return result ;
    }

    private String formatRange(int low, int high) {
        return low == high ? String.valueOf(low) : low + "->" + high ;
    }
}
