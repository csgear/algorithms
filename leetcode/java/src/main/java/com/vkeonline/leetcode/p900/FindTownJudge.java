package com.vkeonline.leetcode.p900;

/**
 * Leetcode [E]: 997. Find the Town Judge
 *
 * @author csgear
 */
public class FindTownJudge {
    public int findJudge(int N, int[][] trust) {

        int[] inBound = new int[N+1] ;
        int[] outBound = new int[N+1] ;

        for(int[] person: trust) {
            outBound[person[0]]++ ;
            inBound[person[1]]++ ;
        }

        for(int i = 1 ; i < N + 1 ; i++) {
            if( inBound[i] == N-1 && outBound[i] == 0) {
                return i ;
            }
        }

        return -1 ;


    }
}
