
package com.vkeonline.leetcode.p2000;

import java.util.Arrays;


/**
 * Leetcode [M]: 2090: K Radius Subarray Averages
 * @author csgear
 */
public class KRadiusSubarrayAverages {
    public int[] getAverages(int[] nums, int k) {
        int n=nums.length, radius = 2*k+1;
        long prefixSum[] = new long[n+1];
        for(int i=0; i<n; i++){
            prefixSum[i+1] = prefixSum[i] + nums[i];
        }

        int res[] = new int[n];
        Arrays.fill(res, -1);
        for(int i=k; i<n-k; i++){
            res[i] = (int) ((prefixSum[i+k+1] - prefixSum[i-k]) / radius);
        }
        return res;
    }
}
