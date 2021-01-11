package com.vkeonline.lintcode.p200;

import com.vkeonline.lintcode.common.BITree;

import java.util.ArrayList;
import java.util.List;

/**
 * Lint code: 249. Count of Smaller Number before itself
 * @author csgear
 */
public class CounterSmallerBefore {
    /**
     * @param nums: an integer array
     * @return A list of integers includes the index of the first number and the index of the last number
     */
    public List<Integer> countOfSmallerNumberII(int[] nums) {
        BITree bitree = new BITree(10000 + 1);
        List<Integer> results = new ArrayList<>();
        for (int num : nums) {
            // query for # which are less than num
            results.add(bitree.query(num - 1));
            bitree.increase(num, 1);
        }

        return results ;
    }
}
