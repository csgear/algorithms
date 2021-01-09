package com.vkeonline.leetcode.year2020.july;

/**
 * @author csgear
 */
public class UglyNumberII {
    public int nthUglyNumber(int n) {
        int[] dp = new int[1690];
        dp[0] = 1;
        int countTwo = 0, countThree = 0, countFive = 0;

        for (int i = 1; i < 1690; i++) {
            int currTwo = dp[countTwo] * 2;
            int currThree = dp[countThree] * 3;
            int currFive = dp[countFive] * 5;

            dp[i] = Math.min (currTwo, Math.min (currThree, currFive));

            if (dp[i] == currTwo) {
                ++countTwo;
            }
            if (dp[i] == currThree) {
                ++countThree;
            }
            if (dp[i] == currFive) {
                ++countFive;
            }
        }

        return dp[n-1] ;

    }
}
