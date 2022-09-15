

package com.vkeonline.leetcode.p900;

import java.util.ArrayList;
import java.util.List;

/**
 * [Leetcode: H] 936. Stamping The Sequence
 *
 * @author csgear
 */
public class StampingSequence {

    public int[] movesToStamp(String stamp, String target) {
        char[] S = stamp.toCharArray();
        char[] T = target.toCharArray();
        List<Integer> res = new ArrayList<>();
        boolean[] visited = new boolean[T.length];
        int stars = 0;

        while (stars < T.length) {
            boolean changed = false;
            for (int i = 0; i <= T.length - S.length; i++) {
                if (!visited[i] && check(S, T, i)) {
                    stars += replace(S, T, i);
                    changed = true;
                    visited[i] = true;
                    res.add(i);
                    if (stars == T.length) {
                        break;
                    }
                }
            }

            if (!changed) {
                return new int[0];
            }
        }

        int[] resArray = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            resArray[i] = res.get(res.size() - i - 1);
        }
        return resArray;
    }

    private boolean check(char[] stamp, char[] target, int index) {
        for (int i = 0; i < stamp.length; i++) {
            if (target[i + index] != '*' && target[i + index] != stamp[i]) {
                return false;
            }
        }
        return true;
    }

    private int replace(char[] stamp, char[] target, int ind) {
        int count = 0;
        for (int i = 0; i < stamp.length; i++) {
            if (target[i + ind] != '*') {
                count++;
                target[i + ind] = '*';
            }
        }
        return count;
    }

}
