package com.vkeonline.enthuware;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArraysFeatureTest {

    @Test
    void checkArrayFeature() {
    }

    @Test
    void checkArraysCompare() {
        int[] ia1 = {0,1,4,5} ;
        int[] ia2 = {0,1,1,5,6} ;
        // compare lexicographically, here ia1 > ia2, return 1, otherwise returns -1
        System.out.println(Arrays.compare(ia1, ia2));
        System.out.println(Arrays.compare(ia2, ia1));
        // find the index of first mismatch element, which returns 2
        System.out.println(Arrays.mismatch(ia1, ia2)) ;
    }


    @Test
    void checkArrayDims1() {
        int[][] array = {{0}, {0,1}, {0,1,2}, {0,1,2,3}, {0,1,2,3,4}} ;
        int[] a1 = array[4] ;
        System.out.println(array[4][1]);
        // this line won't compile, a1 is one dimensional array
        // System.out.println(a1[4][1]);
    }

    @Test()
    void checkArrayDims2() {
        // this line is syntax error
        // var ia[][] = {{1,2}, null} ;
        assertThrows(NullPointerException.class , () -> {
            var ia = new int[][]{{1, 2}, null};
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++)
                    System.out.println(ia[i][j]);
            }
        } ) ;
    }

    @Test
    void checkArrayDim3() {
        int[][] a = new int[2][4] ;
        // this is also a valid syntax, the first dimension shall always be specified
        int[][] b = new int[2][] ;
        b[0] = new int[2] ;
        b[1] = new int[4] ;
    }

    @Test
    void checkInitializer() {
        var args = new String[] {"a", "b", "c"} ;
        String[][] moreArgs = {args} ;
        System.out.println(moreArgs[0][1]);
    }

    @Test
    void fourWaysOfInitializer() {
        // array initialized to the default value of its type
        String[] astr = {"a", "b", null} ;
        System.out.println(astr[2]);
        String[] s1 = new String[] {"aaa"} ;
        String[] s2 = {new String("aaa")} ;
        String[] s3 = {"aaa"} ;
        String[] s4 = new String[1] ; s4[0] = "aaa" ;
    }
}