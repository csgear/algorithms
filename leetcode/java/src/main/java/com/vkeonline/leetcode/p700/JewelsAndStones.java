package com.vkeonline.leetcode.p700;

import java.util.HashSet;
import java.util.Set;

/**
 * Leetcode [E]: 771. Jewels and Stones
 * @author csgear
 */
public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        int res = 0 ;
        Set<Character> setJ = new HashSet<>() ;
        for (char j: J.toCharArray()) {
            setJ.add(j);
        }
        for (char s: S.toCharArray()) {
            if (setJ.contains(s)) {
                res++;
            }
        }
        return res ;
    }
}
