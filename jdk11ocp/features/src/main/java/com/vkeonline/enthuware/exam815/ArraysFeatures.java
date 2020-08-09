package com.vkeonline.enthuware.exam815;

import java.util.Arrays;

public class ArraysFeatures {
    public void checkArrayFeature() {

    }

    public static void main(String[] args) {
        System.out.println(Arrays.binarySearch(new int[]{1,2,3,5,6}, 2)) ;
        System.out.println(Arrays.binarySearch(new int[]{1,2,3,5,6}, 4)) ;
        System.out.println(Arrays.compare(new int[] {1,2,3, 5}, new int[] {1,2}));
        System.out.println(Arrays.compare(new int[] {1,2}, new int[] {1,2,3,4}));
        System.out.println("mismatch " + Arrays.mismatch(new int[] {1,2,3}, new int[] {1,2}));
        System.out.println("mismatch " + Arrays.mismatch(new int[] {1,2}, new int[] {1,2, 3}));

    }
}
