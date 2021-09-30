////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// File: FibonacciNumber.java
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Author: xiaoyang
//
// Nokia - Confidential
// Do not use, distribute, or copy without consent of Nokia.
// Copyright (c) 2021 Nokia. All rights reserved.
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package com.vkeonline.leetcode.p500;

/**
 * Leetcode [E]: 509. 509. Fibonacci Number
 * @author csgear
 */
public class FibonacciNumber {
    public int fib(int N) {
        if (N <= 1) {
            return N;
        }
        int[] dp = new int[N + 1];
        dp[1] = 1;
        for (int i = 2; i <= N; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[N];
    }

}
