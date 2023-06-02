package com.vkeonline.leetcode.year2020.dec;

import com.vkeonline.leetcode.p900.SquaresSortedArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquaresSortedArrayTest {

    @Test
    void sortedSquares() {
        int[] nums = {-4,-1,0,3,10} ;
        int[] expected = {0,1,9,16,100} ;

        SquaresSortedArray squaresSortedArray = new SquaresSortedArray() ;

        assertArrayEquals(expected, squaresSortedArray.sortedSquares(nums));
    }
}