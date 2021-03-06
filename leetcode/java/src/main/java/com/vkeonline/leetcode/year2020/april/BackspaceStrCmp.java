package com.vkeonline.leetcode.year2020.april;

import java.util.Stack;

/**
 * @author csgear
 */
public class BackspaceStrCmp {
    public boolean backspaceCompare(String S, String T) {
        return build(S).equals(build(T)) ;
    }

    private String build(String s) {
        Stack<Character> ans = new Stack<>();
        for (char c: s.toCharArray()) {
            if (c != '#') {
                ans.push(c);
            }
            else if (!ans.empty())
            {
                ans.pop();
            }
        }
        return String.valueOf(ans);
    }
}
