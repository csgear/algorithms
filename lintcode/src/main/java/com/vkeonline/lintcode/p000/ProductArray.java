package com.vkeonline.lintcode.p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * lint code: 50. Product of Array Exclude Itself [medium]
 *
 * @author csgear
 */
public class ProductArray {
    public List<Long> productExcludeItself(List<Integer> nums) {
        int n = nums.size();
        long[] result = new long[n];
        long left = 1, right = 1;

        Arrays.fill(result, 1);

        for (int i = 0; i < nums.size(); i++) {
            result[i] *= left;
            left *= nums.get(i);
            result[n - 1 - i] *= right;
            right *= nums.get(n - 1 - i);
        }

        List<Long> list = new ArrayList<>();
        for (int i = 0; i < result.length; i++) {
            list.add(result[i]) ;
        }

        return list ;
    }
}
