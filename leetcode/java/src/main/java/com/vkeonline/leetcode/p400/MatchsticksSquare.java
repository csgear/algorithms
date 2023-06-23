

package com.vkeonline.leetcode.p400;

import java.util.Arrays;
import java.util.Collections;

/**
 * Leetcode [M]: 473. Matchsticks to Square
 * @author csgear
 */
public class MatchsticksSquare {
    public boolean makeSquare(int[] matchsticks) {
        int sum = Arrays.stream(matchsticks).sum() ;
        if(sum % 4 != 0) {
            return false ;
        }
        int max = Arrays.stream(matchsticks).max().getAsInt() ;
        if(max > sum / 4) {
            return false ;
        }

        // reverse order
        for (int i = 0, j = matchsticks.length - 1; i < j; i++, j--) {
            int temp = matchsticks[i];
            matchsticks[i] = matchsticks[j];
            matchsticks[j] = temp;
        }

        int[] edges = new int[4];

        return dfs(0, matchsticks, edges, sum / 4) ;

    }

    private boolean dfs(int pos, int[] matchsticks, int[] edges, int edgeLength) {
        if(pos == matchsticks.length) {
            return true ;
        }

        for (int i = 0; i < 4; i++) {
            if(edges[i] + matchsticks[pos] > edgeLength || (i > 0 && edges[i - 1] == edges[i])) {
                continue;
            }
            edges[i] += matchsticks[pos] ;

            if(dfs(pos + 1, matchsticks, edges, edgeLength)) {
                return  true ;
            }

            edges[i] -= matchsticks[pos] ;
        }

        return false ;
    }
}
