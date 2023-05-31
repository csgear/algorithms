package com.vkeonline.leetcode.year2020.april;

import com.vkeonline.leetcode.p100.MaximumSubarray;
import com.vkeonline.leetcode.p100.SingleNumber;
import com.vkeonline.leetcode.p200.HappyNumber;
import com.vkeonline.leetcode.p200.MoveZeroes;

import java.util.Arrays;
import java.util.List;

public class Judge {
    public static void main(String[] args) {
        judgeSingleNumber();
        judgeHappyNumber();
        judgeMaximumSubarray();
        judegMoveZeroes();
        judgeGroupAnagrams() ;
    }

    static void judgeSingleNumber() {
        SingleNumber sn = new SingleNumber() ;
        int[] numbers = {4, 1, 2, 1, 2};
        System.out.println(sn.singleNumber(numbers));
    }

    static void judgeHappyNumber() {
        HappyNumber hn = new HappyNumber();

        int n = 19;
        System.out.println(hn.isHappy(n));
    }

    static void judgeMaximumSubarray() {
        MaximumSubarray ms = new MaximumSubarray();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println((ms.maxSubArray(nums)));
    }

    static void judegMoveZeroes() {
        MoveZeroes mz = new MoveZeroes();
        int[] nums = {0, 1, 0, 3, 12};
        mz.moveZeroes(nums);
        List.of(nums).forEach(System.out::println);
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
