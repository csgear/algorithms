
package com.vkeonline.leetcode.p1000;

import java.util.HashMap;


/**
 * Leetcode [M]: 1079. Letter Tile Possibilities
 * @author csgear
 */
public class LetterTilePossibilities {
    private static final int MAX_LENGTH = 8 ;
    // 定义 f[i][j] 表示用前 i 种字符构造长为 j 的序列的方案数
    private static final int[][] c = new int[MAX_LENGTH][MAX_LENGTH] ;

    static {
        for (int i = 0; i < MAX_LENGTH; i++) {
            c[i][0] = 1 ;
            c[i][i] = 1;
            for (int j = 1; j < i; j++) {
                // pick or not pick ith character
                c[i][j] = c[i-1][j-1] + c[i-1][j] ;
            }
        }
    }
    public int numTilePossibilities(String tiles) {
        var counts = new HashMap<Character, Integer>();
        for (var c : tiles.toCharArray()) {
            counts.merge(c, 1, Integer::sum);
        }

        int m = counts.size();
        int n = tiles.length();

        var f = new int[m + 1][n + 1];

        f[0][0] = 1;

        int i = 1;

        for (var cnt : counts.values()) {
            for (int j = 0; j <= n; j++) {
                for (int k = 0; k <= j && k <= cnt; k++) {
                    f[i][j] += f[i - 1][j - k] * c[j][k];
                }
            }
            i++;
        }
        int ans = 0;

        for (int j = 1; j <= n; j++)
            ans += f[m][j];

        return ans ;
    }

    public int dfs(int[] hash){
        int res = 0;
        for(int i = 0;i< hash.length;i++){
            if(hash[i]==0){
                continue;
            }
            hash[i]--;
            res +=  dfs(hash);
            hash[i]++;
        }
        return res+1;
    }

    public int numTilePossibilitiesUsingDfs(String tiles) {
        int[] hash = new int[26];
        for (int i = 0; i < tiles.length(); i++) {
            hash[tiles.charAt(i) - 'A']++;
        }
        return dfs(hash) - 1 ;
    }
}
