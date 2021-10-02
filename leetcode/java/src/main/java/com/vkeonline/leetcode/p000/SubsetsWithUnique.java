package com.vkeonline.leetcode.p000;

import java.util.ArrayList;
import java.util.List;


/**
 * Leetcode [M]: 78. Subsets
 * @author csgear
 */
public class SubsetsWithUnique {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for (int num : nums) {
            int k = result.size();
            for (int j = 0; j < k; j++) {
                List<Integer> list = new ArrayList<>(result.get(j));
                list.add(num);
                result.add(list);
            }
        }
        return result;
    }
}
