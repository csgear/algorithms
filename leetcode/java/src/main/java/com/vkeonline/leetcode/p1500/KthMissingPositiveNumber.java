package com.vkeonline.leetcode.p1500;

/**
 * Leetcode [E]: 1539. Kth Missing Positive Number
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
