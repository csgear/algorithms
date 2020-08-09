package com.vkeonline.lintcode;

import java.util.HashSet;
import java.util.Set;

/**
 * LintCode: 683. Word Break III
 */
public class WordBreakIII {
    public int wordBreak3(String s, Set<String> dict) {
        if (s == null ||s.length() == 0 || dict == null || dict.size() == 0) {
            return 0;
        }

        s = s.toLowerCase() ;
        Set<String> set = new HashSet<>() ;
        for(String word: dict) {
            set.add(word.toLowerCase()) ;
        }

        int len = s.length() ;
        int[] dp = new int[len+1] ;

        dp[0] = 1 ;

        for(int i = 0 ; i < len ; i++) {
            for(int j = i ; j < len ; j++) {
                if(set.contains(s.substring(i, j+1)))
                    dp[j+1] += dp[i] ;
            }
        }

        return dp[len] ;
    }
}
