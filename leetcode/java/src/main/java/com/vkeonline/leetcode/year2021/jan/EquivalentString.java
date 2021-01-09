package com.vkeonline.leetcode.year2021.jan;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author csgear
 */
public class EquivalentString {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuilder sb1 = new StringBuilder() ;
        Arrays.stream(word1).forEach(sb1::append);

        StringBuilder sb2 = new StringBuilder() ;
        Arrays.stream(word2).forEach(sb2::append);
        return sb1.toString().equals(sb2.toString()) ;

        // this is the single line solution
//        String result1 = Arrays.stream(word1).collect(StringBuilder::new,
//                (builder, current)->builder.append(current.toString()),
//                StringBuilder::append).toString() ;


    }
}
