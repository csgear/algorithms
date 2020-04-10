package com.vkeonline.leetcode;

import java.util.ArrayList;
import java.util.List;

public class _078 {
    public class Solution {
        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            result.add(new ArrayList<>());
            for (int num : nums) {
                int k = result.size();
                for (int j = 0; j < k; j++) {
                    List<Integer> list = new ArrayList<>(result.get(j));
                    list.add(num);
                    result.add(list);
                }
            }
            return result;
        }
    }
}
//    public static void main(String[] args) {
//        int[] nums = {1,2,3} ;
//
//        _078 a078 = new _078() ;
//        List<List<Integer>> result = a078.subsets(nums) ;
//
//        for(List<Integer> l: result) {
//            System.out.println(l) ;
//        }
//
//    }
