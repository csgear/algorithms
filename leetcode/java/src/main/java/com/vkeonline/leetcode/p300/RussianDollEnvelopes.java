package com.vkeonline.leetcode.p300;

import java.util.Arrays ;
import java.util.Comparator;

/**
 * Leetcode [H]: 354. Russian Doll Envelopes
 * @author csgear
 */
public class RussianDollEnvelopes {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, (arr1, arr2) -> {
            if(arr1[0] == arr2[0]) {
                return arr2[1] - arr1[1] ;
            }
            else {
                return arr1[0] - arr2[0] ;
            }
        });

        int[] secondDim = new int[envelopes.length] ;
        for (int i = 0; i < envelopes.length; ++i) {
            secondDim[i] = envelopes[i][1] ;
        }

        return lengthOfLis(secondDim) ;
    }


    /**
     * n * log(n) running time algorithm
     * @param nums an array
     * @return the length of the longest increasing subsequence
     */
    private int lengthOfLis(int[] nums) {
        int[] dp = new int[nums.length];
        int len = 0;
        for (int num : nums) {
            int i = Arrays.binarySearch(dp, 0, len, num);
            if (i < 0) {
                // this is the trick part, the binarySearch returns negative values if an element is not found
                i = -(i + 1);
            }
            dp[i] = num;
            if (i == len) {
                len++;
            }
        }
        return len;
    }
    private int lengthOfLisDp(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int longest = 0;
        for (int c: dp) {
            longest = Math.max(longest, c);
        }

        return longest;
    }
}
