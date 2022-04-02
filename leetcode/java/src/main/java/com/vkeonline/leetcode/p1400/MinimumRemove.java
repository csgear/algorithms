package com.vkeonline.leetcode.p1400;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * Leetcode [M] : 1249 Minimum Remove to Make Valid Parentheses
 *
 * @author csgear
 */
public class MinimumRemove {
    public String minRemoveToMakeValid(String s) {

        Stack<Integer> stack = new Stack<>();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    set.add(i);
                } else {
                    stack.pop();
                }
            }
        }

        while (!stack.empty()) {
            set.add(stack.pop());
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(i)) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
