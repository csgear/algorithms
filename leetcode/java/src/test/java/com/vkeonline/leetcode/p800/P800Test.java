package com.vkeonline.leetcode.p800;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author csgear
 */
class P800Test {

    @Test
    void mirrorReflection() {
        MirrorReflection mirrorReflection = new MirrorReflection() ;
        int p = 2 ;
        int q = 1 ;
        int expected = 2 ;
        assertEquals(expected, mirrorReflection.mirrorReflection(p, q));
    }

    @Test
    void numFactoredBinaryTrees() {
        BinaryTreesWithFactors binaryTreesWithFactors = new BinaryTreesWithFactors() ;
        int[] arr = {2,4,5,10} ;
        int expected = 7 ;

        assertEquals(expected, binaryTreesWithFactors.numFactoredBinaryTrees(arr));
    }
}