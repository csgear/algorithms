package com.vkeonline.lintcode.p1000;

import java.util.*;

/**
 * Lintcode: #1032
 * @author csgear
 */
public class LetterCasePermutation {
    public List<String> letterCasePermutation(String S) {
        if(S == null) return new ArrayList<>() ;

        Queue<String> queue = new ArrayDeque<>() ;
        queue.offer(S) ;

        for(int i = 0 ; i < S.length() ; i++) {
            if(Character.isDigit(S.charAt(i))) continue; ;
            int size = queue.size() ;
            for(int j = 0 ; j < size ; j++) {
                String cur = queue.poll() ;
                char[] chs = cur.toCharArray() ;

                chs[i] = Character.toLowerCase(chs[i]) ;
                queue.offer(String.valueOf(chs)) ;
                chs[i] = Character.toUpperCase(chs[i]) ;
                queue.offer(String.valueOf(chs)) ;
            }
        }

        return new ArrayList<>(queue) ;
    }
}
