package com.vkeonline.lintcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Lintcode: 1045. Partition Labels
 * @author csgear
 */
public class PartitionLabels {
    public List<Integer> partitionLabels(String S) {
        int[] last = new int[26];
        for (int i = 0; i < S.length(); ++i) {
            last[S.charAt(i) - 'a'] = i;
        }

        int right = 0, left = 0;
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < S.length(); ++i) {
            right = Math.max(right, last[S.charAt(i) - 'a']);
            if (i == right) {
                ans.add(i - left + 1);
                left = i + 1;
            }
        }
        return ans;
    }
}
