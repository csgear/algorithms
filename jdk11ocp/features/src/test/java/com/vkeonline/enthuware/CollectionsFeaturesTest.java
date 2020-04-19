package com.vkeonline.enthuware;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CollectionsFeaturesTest {
    static CollectionsFeatures cf = new CollectionsFeatures() ;
    @Test
    void checkBinarySearch() {
        cf.checkBinarySearch();
    }

    @Test
    @DisplayName("Check the return value of binary search")
    /**
     * Arrays.binarySearch and Collections.binarySearch returns the insert position (negative pos - 1) if element is not found
     *
     */
    void checkBSReturns() {
        int[] nums = {6,9,1,8} ;
        Arrays.sort(nums) ;
        assertEquals(1, Arrays.binarySearch(nums, 6));
        assertEquals(-2, Arrays.binarySearch(nums, 3));
    }
}