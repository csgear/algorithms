package com.vkeonline.leetcode.year2020.april;

import java.util.Arrays;
import java.util.List;

public class Judge {
    public static void main(String[] args) {
        judgeSingleNumber();
        judgeHappyNumber();
        judgeMaximumSubarray();
        judegMoveZeroes();
        judgeSellStockII();
        judgeGroupAnagrams() ;
    }

    static void judgeSingleNumber() {
        SingleNumber sn = new SingleNumber() ;
        int[] numbers = {4,1,2,1,2} ;
        System.out.println(sn.singleNumber(numbers)) ;
    }

    static void judgeHappyNumber() {
        HappyNumber hn = new HappyNumber() ;

        int n = 19 ;
        System.out.println(hn.isHappy(n));
    }
    static  void judgeMaximumSubarray() {
        MaximumSubarray ms = new MaximumSubarray() ;
        int[] nums =  {-2,1,-3,4,-1,2,1,-5,4} ;

        System.out.println((ms.maxSubArray(nums)));
    }

    static  void judegMoveZeroes() {
        MoveZeroes mz = new MoveZeroes() ;
        int[] nums = {0,1,0,3,12} ;
        mz.moveZeroes(nums) ;
        Arrays.asList(nums).forEach(System.out::println);
    }

    static void judgeSellStockII() {
        SellStockII stii = new SellStockII() ;
        System.out.println(stii.maxProfit(new int[]{7,1,5,3,6,4}))  ;
        System.out.println(stii.maxProfit(new int[]{1, 2, 3, 4, 5})) ;
        System.out.println(stii.maxProfit(new int[]{7,6,4,3,1})) ;
    }

    static void judgeGroupAnagrams() {
        GroupAnagrams ga = new GroupAnagrams() ;
        List<List<String>> result = ga.groupAnagrams(new String[]{ "eat", "tea", "tan", "ate", "nat", "bat"}) ;

        // TODO: class casting won't work here, we shall pass new String[0] to toArray function
        for(List<String> innerLs : result) {
            String[] arr =  innerLs.toArray(new String[0]);
            System.out.println(Arrays.deepToString(arr));
        }
    }
}
