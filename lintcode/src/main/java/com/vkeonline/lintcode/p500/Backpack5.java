package com.vkeonline.lintcode.p500;

/**
 * Lint code: 563. Backpack V
 *
 * @author csgear
 */
public class Backpack5 {
    public int backPackV(int[] nums, int target) {
        int[] f = new int[target + 1];
        f[0] = 1;
        for (int num : nums) {
            for (int j = target; j >= num; j--) {
                f[j] += f[j - num];
            }
        }
        return f[target];
    }
}
