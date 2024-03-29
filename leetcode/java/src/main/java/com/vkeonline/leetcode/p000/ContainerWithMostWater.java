package com.vkeonline.leetcode.p000;

/**
 * Leetcode [M]: 11. Container With Most Water
 *
 * @author csgear
 */
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxWater = 0, left = 0, right = height.length - 1;
        while (left < right) {
            maxWater = Math.max(maxWater, (right - left) * Math.min(height[left], height[right]));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }
}
