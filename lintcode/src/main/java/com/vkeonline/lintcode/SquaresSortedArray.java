package com.vkeonline.lintcode;

import java.util.Arrays;
import java.util.Comparator;

public class SquaresSortedArray {
    public int[] SquareArray(int[] A) {
        return Arrays.stream(A).map(i->i*i).sorted().toArray() ;
    }
}
