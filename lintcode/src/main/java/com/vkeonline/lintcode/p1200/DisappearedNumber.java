package com.vkeonline.lintcode.p1200;

import java.util.ArrayList;
import java.util.List;

/**
 * @author csgear
 */
public class DisappearedNumber {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            // index start from 0
            int m = Math.abs(nums[i]) - 1;
            nums[m] = nums[m] > 0 ? -nums[m] : nums[m];
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            if (nums[i] > 0) {
                res.add(i + 1);
            }
        }
        return res;
    }
}
