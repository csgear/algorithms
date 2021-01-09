package com.vkeonline.leetcode.p100;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Permutation2Test {

    @Test
    void permuteUnique() {
        Permutation2 permutation2 = new Permutation2() ;

        int[] nums = {1,2,3} ;

        permutation2.permuteUnique(nums).forEach(System.out::println);
    }
}