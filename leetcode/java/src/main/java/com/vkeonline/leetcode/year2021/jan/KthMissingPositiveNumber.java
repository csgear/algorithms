package com.vkeonline.leetcode.year2021.jan;

/**
 * @author csgear
 */
public class KthMissingPositiveNumber {
    public int findKthPositive(int[] arr, int k) {
        for(int i : arr) {
            if(i <= k) {
                k++;
            }
        }
        return k;
    }
}
