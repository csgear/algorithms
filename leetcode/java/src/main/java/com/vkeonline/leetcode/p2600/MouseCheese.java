
package com.vkeonline.leetcode.p2600;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Leetcode [M]: 2611. Mice and Cheese
 * @author csgear
 */
public class MouseCheese {
    public int miceAndCheese(int[] reward1, int[] reward2, int k) {
        int ans = 0 ;
        int n = reward1.length ;
        Integer[] diffs = new Integer[n] ;
        for (int i = 0; i < n; i++) {
            ans += reward2[i] ;
            diffs[i] = reward1[i] - reward2[i] ;
        }
        Arrays.sort(diffs, Collections.reverseOrder());

        for (int i = 0; i < k; i++) {
            ans += diffs[i] ;
        }
        return ans ;
    }
}
