package com.vkeonline.lintcode;

import java.util.Arrays;
import java.util.List;

/**
 * LintCode: 1323. Fetch supplies
 */
public class FetchSupplies {
    // Why median not the middle
    public int fetchsupplies(List<List<Integer>> coordinates) {
        int[] arr = new int[coordinates.size()] ;
        for(int i = 0 ; i < coordinates.size() ; i++) {
            arr[i] = coordinates.get(i).get(0) ;
        }

        Arrays.sort(arr) ;

        int mid = arr[arr.length / 2] ;

        int result = 0 ;

        for(int i = 0 ; i < arr.length ; i++)
            result += Math.abs(arr[i] - mid) ;

        return result ;
    }
}
