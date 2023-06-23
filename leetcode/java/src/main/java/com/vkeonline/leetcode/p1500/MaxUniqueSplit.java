

package com.vkeonline.leetcode.p1500;

import java.util.HashSet;
import java.util.Set;

/**
 * 1593. Split a String Into the Max Number of Unique Substrings
 * @author csgear
 */
public class MaxUniqueSplit {
    private int maxSplit = 1 ;
    public int maxUniqueSplit(String s) {
        Set<String> curr = new HashSet<>() ;

        backtrack(0, 0, s, curr) ;

        return maxSplit ;
    }

    private void backtrack(int index, int split, String s,Set<String> curr) {
        int length = s.length() ;
        if(index >= length ) {
            maxSplit = Math.max(maxSplit, split) ;
        }

        if(curr.size() + (length - index) < maxSplit) {
            return;
        }

        for (int j = index; j < s.length(); j++) {
            String sub = s.substring(index, j+1) ;
            if(curr.add(sub)) {
                backtrack(j + 1, split + 1, s, curr);
                curr.remove(sub) ;
            }

        }
    }
}
