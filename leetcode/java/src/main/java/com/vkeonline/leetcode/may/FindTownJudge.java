package com.vkeonline.leetcode.may;

/**
 * Leetcode: 997. Find the Town Judge
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
            if( inBound[i] == N-1 && outBound[i] == 0) return i ;
        }

        return -1 ;

//        int[] isTrusted = new int[N+1];
        // count the degree of each node (degree = inbound - outbound)
//        for(int[] person : trust){
//            isTrusted[person[0]]--;
//            isTrusted[person[1]]++;
//        }
//        for(int i = 1;i < isTrusted.length;i++){
//            if(isTrusted[i] == N-1) return i;
//        }
//        return -1;
    }
}
