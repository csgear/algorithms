
package com.vkeonline.leetcode.p2000;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;


public class P2000Test {

    @Test
    void targetIndices() {
        FindTargetIndices findTargetIndices = new FindTargetIndices() ;
        int[] nums = {1,2,5,2,3} ;
        int target = 2 ;
        List<Integer> expected = Arrays.asList(1, 2) ;
        assertIterableEquals(expected, findTargetIndices.targetIndices(nums, target)); ;
    }

    @Test
    void getAverages() {
        KRadiusSubarrayAverages kRadiusSubarrayAverages = new KRadiusSubarrayAverages() ;
        int[] nums = {7,4,3,9,1,8,5,2,6} ;
        int k = 3 ;
        int[] expected = {-1,-1,-1,5,4,4,-1,-1,-1} ;
        assertArrayEquals(expected, kRadiusSubarrayAverages.getAverages(nums, k));
    }
}
