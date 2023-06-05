

package com.vkeonline.leetcode.p1500;

/**
 * Leetcode [H]: 1537. Get the Maximum Score
 * @author csgear
 */
public class GetMaximumScore {
    public int maxSum(int[] nums1, int[] nums2) {
        long dp0 = 0, dp1 = 0 ;
        int m = nums1.length ;
        int n = nums2.length ;
        int i = 0, j = 0;

        while(i < m && j <n) {
            if (nums1[i] < nums2[j]) {
                dp0 = dp0 + nums1[i];
                i++;
            } else if (nums1[i] > nums2[j]) {
                dp1 = dp1 + nums2[j];
                j++;
            } else {
                long best = Math.max(dp0, dp1) + nums1[i];
                dp0 = dp1 = best;
                i++;
                j++;
            }
        }
        while (i < m) {
                dp0 = dp0 + nums1[i] ;
                i++ ;
        }
        while(j < n) {
            dp1 = dp1 + nums2[j];
            j++;
        }

        return (int) ( Math.max(dp0, dp1) % 1000000007) ;
    }
}
