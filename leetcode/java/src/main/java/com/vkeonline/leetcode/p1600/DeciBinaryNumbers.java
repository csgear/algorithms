package com.vkeonline.leetcode.p1600;

/**
 * Leetcode [M]: 1689. Partitioning Into Minimum Number Of Deci-Binary Numbers
 *
 * @author csgear
 */
public class DeciBinaryNumbers {
    public int minPartitions(String n) {
        int maximum = 0;
        for (int i = 0; i < n.length(); i++) {
            maximum = Math.max(maximum, n.charAt(i) - '0');
        }
        return maximum;
    }
}
