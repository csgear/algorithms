package com.vkeonline.leetcode.boilerplate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author csgear
 */
class BoilerPlateTest {

    @Test
    void testBinarySearch() {
        BinarySearch binarySearch = new BinarySearch();
        int[] nums = { 1, 2, 2, 2, 5 };
        int target = 2;
        int expected = 2;
        assertEquals(expected, binarySearch.binarySearch2(
                nums, target
        ));
    }

    @Test
    void testBinarySearchLeftMost() {
        BinarySearch binarySearch = new BinarySearch();
        int[] nums = { 1, 2, 2, 2, 5 };
        int target = 2;
        int expected = 1;
        assertEquals(expected, binarySearch.binarySearchLeftMost(
                nums, target
        ));
    }

    @Test
    void testBinarySearchRightMost() {
        BinarySearch binarySearch = new BinarySearch();
        int[] nums = { 1, 2, 2, 2, 5 };
        int target = 2;
        int expected = 3;
        assertEquals(expected,
                binarySearch.binarySearchRightMost(nums, target) - 1);
    }
}