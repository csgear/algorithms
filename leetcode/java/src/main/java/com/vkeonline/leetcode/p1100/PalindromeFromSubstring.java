/*
 * Copyright (c) 2023 HyTrust Inc. All rights reserved.
 */

package com.vkeonline.leetcode.p1100;

import java.util.ArrayList;
import java.util.List;

/**
 * Leetcode [M]: 1177. Can Make Palindrome from Substring
 * @author csgear
 */
public class PalindromeFromSubstring {
    public List<Boolean> canMakePaliQueries(String s, int[][] queries) {
        List<Boolean> result = new ArrayList<>() ;
        int n = s.length() ;
        int[] prefixSum = new int[n + 1] ;
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] ^ (1 << (s.charAt(i) - 'a')) ;
        }

        for(var query: queries) {
            int left = query[0] ;
            int right = query[1] ;
            int k = query[2] ;
            int sub = prefixSum[right + 1] ^ prefixSum[left] ;
            int bits = Integer.bitCount(sub) ;
            result.add(bits <= k * 2 + 1);
        }

        return result ;
    }
}
