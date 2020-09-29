package com.vkeonline.lintcode.p800;

/**
 * LintCode: 832. Count Negative Number
 * @author csgear
 */
public class CountNegativeNumber {
    public int countNumber(int[][] nums) {
        int n = nums.length;
        int m = nums[0].length;
        int ans = 0;
        int index = m - 1;
        for(int i = 0; i < n; i++) {
            // TODO: binary search on each row
            while(index >= 0) {
                if(nums[i][index] < 0) {
                    break;
                }
                --index;
            }
            ans += index + 1;
        }
        return ans;
    }
}
