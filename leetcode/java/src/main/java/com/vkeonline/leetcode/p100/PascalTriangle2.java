package com.vkeonline.leetcode.p100;

import java.util.ArrayList;
import java.util.List;

/**
 * Leetcode [E]: 119. Pascal's Triangle II
 *
 * @author csgear
 */
public class PascalTriangle2 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prev = new ArrayList<>();

        prev.add(1);

        for (int i = 0; i <= rowIndex; ++i) {
            List<Integer> curr = new ArrayList<>();
            for (int j = 0; j <= i; ++j) {
                if (j == 0 || j == i) {
                    curr.add(1);
                } else {
                    curr.add(prev.get(j - 1) + prev.get(j));
                }

                prev = curr;
            }
        }
        return prev;
    }
}
