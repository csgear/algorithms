////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// File: SubsetsII.java
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

package com.vkeonline.leetcode.p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII {
    List<List<Integer>> result = new ArrayList<>() ;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums) ;
        backTracking( 0, nums, new ArrayList<>() );
        return result ;
    }

    private void backTracking(int index, int[] nums, List<Integer> list) {
        result.add(new ArrayList<>(list)) ;
        for( int i = index;i < nums.length; i++ ) {
            if (i != index && nums[i] == nums[i - 1]) //skip the duplicates, except for the first time
            {
                continue;
            }
            list.add( nums[i]);
            backTracking(i + 1, nums, list);
            list.remove( list.size() - 1) ;
        }
    }

}
