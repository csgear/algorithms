package com.vkeonline.lintcode;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {


    public int numJewelsInStones(String J, String S) {
        int res = 0;

        Set<Character> setJ = new HashSet<Character>();

        for (char j : J.toCharArray()) setJ.add(j);
        for (char s : S.toCharArray()) if (setJ.contains(s)) res++;
        return res;
    }
}
