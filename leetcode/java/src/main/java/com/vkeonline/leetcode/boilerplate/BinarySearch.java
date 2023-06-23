

package com.vkeonline.leetcode.boilerplate;

/**
 * 二分查找中，寻找 leftIdx 即为在数组中寻找第一个大于等于target的下标
 * 寻找rightIdx 即为在数组中寻找第一个大于target 的下标，然后将下标减一
 *
 * @author csgear
 */
public class BinarySearch {
    /**
     * 初始条件：left = 0, right = length-1
     * 终止：left > right
     * 向左查找：right = mid-1
     * 向右查找：left = mid+1
     */
    int binarySearch1(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    /**
     * 初始条件：left = 0, right = length
     * 终止：left == right
     * 向左查找：right = mid
     * 向右查找：left = mid+1
     */
    int binarySearch2(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        if (left != nums.length && nums[left] == target) {
            return left;
        }
        return -1;
    }

    /**
     * 初始条件：left = 0, right = length-1
     * 终止：left + 1 == right
     * 向左查找：right = mid
     * 向右查找：left = mid
     */
    public int binarySearch3(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int left = 0, right = nums.length - 1;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid;
            } else {
                right = mid;
            }
        }

        if (nums[left] == target) {
            return left;
        }
        if (nums[right] == target) {
            return right;
        }
        return -1;
    }

    public int binarySearchRightMost(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;

    }

    public int binarySearchLeftMost(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
