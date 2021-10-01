package com.vkeonline.leetcode.p100;

/**
 * Leetcode [M]: 167. Two Sum II - Input array is sorted
 * @author csgear
 */
public class TwoSumOnSortedArray {

    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum > target) {
                right--;
            } else if (sum < target) {
                left++;
            } else {
                return new int[]{left + 1, right + 1};
            }
        }
        return null;
    }
}

