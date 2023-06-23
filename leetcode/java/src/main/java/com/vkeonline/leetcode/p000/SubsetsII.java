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

/**
 * Leetcode [M]: 90 Subset II
 * @author csgear
 */
public class SubsetsII {
    List<List<Integer>> result = new ArrayList<>() ;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums) ;
        dfs( 0, nums, new ArrayList<>() );
        return result ;
    }

    private void dfs(int index, int[] nums, List<Integer> list) {
        result.add(new ArrayList<>(list)) ;
        for( int i = index;i < nums.length; i++ ) {
            //skip the duplicates, except for the first time
            if (i != index && nums[i] == nums[i - 1])
            {
                continue;
            }
            list.add( nums[i]);
            dfs(i + 1, nums, list);
            list.remove( list.size() - 1) ;
        }
    }

}
