package com.vkeonline.lintcode.p100;

import java.util.*;

/**
 * Lint code: 107. Word Break
 * @author csgear
 */
public class WordBreak {
    public boolean wordBreak(String s, Set<String> wordSet) {
        Map<String, Boolean> memo = new HashMap<>();
        return dfs(s, wordSet, 0, memo);
    }

    private boolean dfs(String s, Set<String> wordSet, int now, Map<String, Boolean> memo) {
        if (now == s.length()) {
            return true;
        }
        if (memo.containsKey(s)) {
            return memo.get(s);
        }

        for (int len = 1; now + len <= s.length(); len++) {
            if (wordSet.contains(s.substring(now, now + len)) && dfs(s, wordSet, now + len, memo)) {
                return true;
            }
        }
        memo.put(s, false);
        return false;
    }

    public boolean wordBreakWithDP(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict) ;
        int n = s.length() ;
        boolean[] dp = new boolean[ n + 1] ;
        dp[0] = true ;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                if(dp[j]) {
                    if(wordSet.contains(s.substring(j, i))) {
                        dp[i] = true ;
                        break ;
                    }
                }
            }
        }

        return dp[n] ;
    }
}
