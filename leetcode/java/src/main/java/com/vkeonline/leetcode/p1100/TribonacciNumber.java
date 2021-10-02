////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// File: TribonacciNumber.java
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

package com.vkeonline.leetcode.p1100;

/**
 *  Leetcode [E]: 1137. N-th Tribonacci Number
 * @author csgear
 */
public class TribonacciNumber {
    public int tribonacci(int n) {
        if (n < 3) {
            return n == 0 ? 0 : 1;
        }
        int[] nums = new int[n+1] ;
        nums[1] = nums[2] = 1 ;
        for (int i = 3; i <= n; i++) {
            nums[i] = nums[i-3] + nums[i-2] + nums[i-1] ;
        }
        return nums[n] ;
    }
}
