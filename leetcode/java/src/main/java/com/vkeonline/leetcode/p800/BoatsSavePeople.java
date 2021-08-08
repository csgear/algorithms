package com.vkeonline.leetcode.p800;

import java.util.Arrays;

/**
 * Leetcode [M]: 881. Boats to Save People
 * @author csgear
 */
public class BoatsSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        int result = 0 ;
        int i = 0, j = people.length - 1 ;
        Arrays.sort(people) ;
        while(i <= j) {
            result++ ;
            if(people[i] + people[j] <= limit) {
                i++ ;
            }
            j-- ;
        }
        return  result ;
    }
}
