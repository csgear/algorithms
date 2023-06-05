package com.vkeonline.amazon;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author csgear
 */
class AmazonTest {

    @Test
    void massage() {
        MassageTime massageTime = new MassageTime() ;
        int[] nums = {2,1,4,5,3,1,1,3} ;
        int expected = 12 ;
        assertEquals(expected, massageTime.massage(nums));
    }

    @Test
    void smallestK() {
        SmallestK smallestK = new SmallestK() ;
        int[] arr = {1,3,5,7,2,4,6,8} ;
        int k = 4 ;
        int[] expected = {1,2,3,4} ;
        int[] result = smallestK.smallestSpaceK(arr,k) ;
        Arrays.sort(result) ;
        assertArrayEquals(expected, result) ;
    }
}