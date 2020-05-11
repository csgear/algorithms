package com.vkeonline.lintcode;

import java.util.ArrayList;
import java.util.List;

/**
 * LintCode: 914. Flip Game
 */
public class FlipGame {
    public List<String> generatePossibleNextMoves(String s) {
        int l = s.length();
        List<String> list = new ArrayList();
        char[] chars = s.toCharArray();
        for (int i = 0; i < l - 1; i++) {
            if (chars[i] == '+' && chars[i + 1] == '+') {
                chars[i] = '-';
                chars[i + 1] = '-';
                list.add(String.valueOf(chars));
                chars[i] = '+';
                chars[i + 1] = '+';
            }
        }
        return list;
    }
}
