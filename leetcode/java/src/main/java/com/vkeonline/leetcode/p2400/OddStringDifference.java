

package com.vkeonline.leetcode.p2400;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Leetcode [E]: 2451. Odd String Difference
 * @author csgear
 */
public class OddStringDifference {
    public String oddString(String[] words) {
        int[] diff0 = getDiffs(words[0]);
        int[] diff1 = getDiffs(words[1]);
        if (Arrays.equals(diff0, diff1)) {
            for (int i = 2; i < words.length; i++) {
                if (!Arrays.equals(diff0, getDiffs(words[i]))) {
                    return words[i];
                }
            }
        }
        return Arrays.equals(diff0, getDiffs(words[2])) ? words[1] : words[0];
    }

    private int[] getDiffs(String word) {
        int[] diff = new int[word.length() - 1];
        for (int i = 0; i + 1 < word.length(); i++) {
            diff[i] = word.charAt(i + 1) - word.charAt(i);
        }
        return diff;
    }
}
