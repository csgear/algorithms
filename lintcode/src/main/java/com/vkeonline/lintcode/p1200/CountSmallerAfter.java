package com.vkeonline.lintcode.p1200;

import com.vkeonline.lintcode.common.BITree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Lint code: 1297. Count of Smaller Numbers After Self
 *
 * @author csgear
 */
public class CountSmallerAfter {
    /**
     * @param nums: a list of integers
     * @return return a list of integers
     */
    public List<Integer> countSmaller(int[] nums) {
        // convert the array to a ranked array
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Arrays.binarySearch(sorted, nums[i]) + 1;
        }

        List<Integer> results = new LinkedList<>();

        BITree bitTree = new BITree(nums.length + 1);

        for (int i = nums.length - 1; i >= 0; i--) {
            results.add(0, bitTree.query(nums[i] - 1));
            bitTree.increase(nums[i], 1);
        }

        return results;
    }
}
