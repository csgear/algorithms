/*
 * Copyright (c) 2023 HyTrust Inc. All rights reserved.
 */

package com.vkeonline.leetcode.p400;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiaojun.yang
 */
public class FourSum2 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> mapper = new HashMap<>() ;
        int result = 0 ;
        for(int i : nums1) {
            for(int j: nums2) {
                mapper.merge(i + j, 1, Integer::sum);
            }
        }
        for(int i : nums3) {
            for(int j : nums4) {
                result += mapper.getOrDefault( -(i + j), 0) ;
            }
        }
        return result ;
    }
}
