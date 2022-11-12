

package com.vkeonline.leetcode.p1100;

/**
 * Leetcode [M]: 1198. Find Smallest Common Element in All Rows
 */
public class FindSmallestCommonElement {
    public int smallestCommonElement(int[][] mat) {
        int[] count = new int[10001];
        int n = mat.length, m = mat[0].length;
        for (int j = 0; j < m; ++j) {
            for (int[] ints : mat) {
                if (++count[ints[j]] == n) {
                    return ints[j];
                }
            }
        }
        return -1;
    }
}
