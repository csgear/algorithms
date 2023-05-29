package com.vkeonline.leetcode.p1600;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Leetcode [E]: 1662. Check If Two String Arrays are Equivalent
 * @author csgear
 */
public class EquivalentString {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuilder sb1 = new StringBuilder() ;
        Arrays.stream(word1).forEach(sb1::append);

        StringBuilder sb2 = new StringBuilder() ;
        Arrays.stream(word2).forEach(sb2::append);
        return sb1.toString().equals(sb2.toString()) ;


    }
}
