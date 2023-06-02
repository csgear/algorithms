package com.vkeonline.leetcode.p900;

/**
 * Leetcode [E]: 941. Valid Mountain Array
 * @author csgear
 */
public class MountainArray {
    public boolean validMountainArray(int[] arr) {
        int size = arr.length;
        if (size < 3) {
            return false;
        }

        int i = 0, j = size - 1;
        while (i + 1 < size && arr[i] < arr[i + 1]) {
            ++i;
        }
        while (j - 1 >= 0 && arr[j] < arr[j - 1]) {
            --j;
        }
        return i == j && i > 0 && j < size - 1;
    }
}
