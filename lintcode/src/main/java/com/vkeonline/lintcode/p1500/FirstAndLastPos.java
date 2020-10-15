package com.vkeonline.lintcode.p1500;

import java.util.ArrayList;
import java.util.List;

/**
 * Lint code: 1536. Find First and Last Position of Element in Sorted Array
 * @author csgear
 */
public class FirstAndLastPos {
    private int getLeft(List<Integer> nums, int target) {
        int start = 0, end = nums.size() - 1;
        int mid;
        while (start + 1 < end) {
            mid = start + (end - start) / 2;
            if (nums.get(mid) >= target) {
                end = mid;
            } else {
                start = mid;
            }
        }

        if (nums.get(start) == target) {
            return start;
        }
        if (nums.get(end) == target) {
            return end;
        }

        return -1;
    }

    private int getRight(List<Integer> nums, int target) {
        int start = 0, end = nums.size() - 1;
        int mid;
        while (start + 1 < end) {
            mid = start + (end - start) / 2;
            if (nums.get(mid) <= target) {
                start = mid;
            } else {
                end = mid;
            }
        }

        if (nums.get(end) == target) {
            return end;
        }
        if (nums.get(start) == target) {
            return start;
        }

        return -1;
    }

    public List<Integer> searchRange(List<Integer> nums, int target) {
        // Write your code here.
        int left = getLeft(nums, target);
        int right = getRight(nums, target);

        List<Integer> list = new ArrayList<>();
        list.add(left);
        list.add(right);

        return list;
    }
}
