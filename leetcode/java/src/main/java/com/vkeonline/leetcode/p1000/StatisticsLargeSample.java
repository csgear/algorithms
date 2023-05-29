/*
 * Copyright (c) 2023 HyTrust Inc. All rights reserved.
 */

package com.vkeonline.leetcode.p1000;

import java.util.Arrays;

/**
 * Leetcode [M]: 1093. Statistics from a Large Sample
 * @author xiaojun.yang
 */
public class StatisticsLargeSample {
    public double[] sampleStats(int[] count) {
        double median = 0.0, mean, max, min, mode = 0;
        max = Integer.MIN_VALUE ;
        min = Integer.MAX_VALUE ;
        int total = Arrays.stream(count).sum() ;
        int n = count.length ;
        double sum = 0.0 ;
        int maxFrequency = 0 ;

        for (int i = 0; i < n; i++) {
            if(count[i] > 0) {
                if(min == Integer.MAX_VALUE) {
                    min = i ;
                }
                max = i ;
            }
            sum += i * count[i] ;
            if(count[i] > maxFrequency) {
                maxFrequency = count[i] ;
                mode = i ;
            }
        }

        mean = sum / total ;
        return new double[] {min, max, mean, median, mode} ;
    }
}
