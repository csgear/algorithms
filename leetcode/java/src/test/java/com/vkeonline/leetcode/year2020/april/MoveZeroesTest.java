package com.vkeonline.leetcode.year2020.april;

import com.vkeonline.leetcode.p200.MoveZeroes;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MoveZeroesTest {

    @Test
    void moveZeroes() {
        MoveZeroes mz = new MoveZeroes();
        int[] nums = {0, 1, 0, 3, 12};
        mz.moveZeroes(nums);
        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums);
        System.out.println(Arrays.toString(nums));
        Arrays.stream(nums).forEach(num -> System.out.print(num + ", "));
    }
}