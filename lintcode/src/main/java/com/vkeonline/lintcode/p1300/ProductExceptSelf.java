package com.vkeonline.lintcode.p1300;

/**
 * Lint code: 1310. Product of Array Except Self
 *
 * @author csgear
 */
public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        result[0] = 1;

        // products of 1,2,....n-1 numbers
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= right;
            right *= nums[i];
        }
        return result;
    }
}
