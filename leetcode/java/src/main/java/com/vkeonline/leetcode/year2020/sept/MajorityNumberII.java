package com.vkeonline.leetcode.year2020.sept;

import java.util.ArrayList;
import java.util.List;

/**
 * @author csgear
 */
public class MajorityNumberII {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int first = 0, second = 0;
        int firstCount = 0, secondCount = 0;
        for (int x : nums) {
            if (x == first) {
                firstCount++;
            } else if (x == second) {
                secondCount++;
            } else if (firstCount == 0) {
                first = x;
                firstCount = 1;
            } else if (secondCount == 0) {
                second = x;
                secondCount = 1;
            } else {
                firstCount--;
                secondCount--;
            }
        }

        firstCount = 0;
        secondCount = 0;
        for (int x : nums) {
            if (x == first) {
                firstCount++;
            } else if (x == second) {
                secondCount++;
            }
        }
        if (firstCount > nums.length / 3) {
            list.add(first);
        }
        if (first != second && secondCount > nums.length / 3) {
            list.add(second);
        }
        return list;
    }
}
