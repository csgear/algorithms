

package com.vkeonline.leetcode.p1100;

/**
 * Leetcode [M]: 1170. Compare Strings by Frequency of the Smallest Character
 * @author csgear
 */
public class CompareStringsByFreq {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] prefixSum = new int[12] ;

        for (String s : words) {
            int freq = frequencyOfSmallestCharacter(s) ;
            prefixSum[freq]++;
        }

        for (int i = 9; i >= 1 ; i--) {
            prefixSum[i] += prefixSum[i+1] ;
        }

        int[] res = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int freq = frequencyOfSmallestCharacter(queries[i]) ;
            res[i] = prefixSum[freq + 1];
        }

        return res;

    }

    private int frequencyOfSmallestCharacter(String s) {
        int cnt = 0 ;
        int ch = 'z' ;

        for(char c : s.toCharArray()) {
            if(c < ch) {
                ch = c ;
                cnt = 1 ;
            }
            else if(ch == c) {
                cnt++ ;
            }
        }

        return cnt ;
    }

}
