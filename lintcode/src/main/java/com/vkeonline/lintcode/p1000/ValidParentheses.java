package com.vkeonline.lintcode.p1000;

import java.util.Stack;

/**
 * Lint code: 1089. Valid Parenthesis String
 * @author csgear
 */
public class ValidParentheses {
    public boolean isValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();

        for (Character c : s.toCharArray()) {
            if ("({[".indexOf(c) >= 0) {
                stack.push(c);
            } else {
                if (!stack.isEmpty() && isValid(stack.peek(), c)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private boolean isValid(char c1, char c2) {
        return (c1 == '(' && c2 == ')') || (c1 == '{' && c2 == '}')
                || (c1 == '[' && c2 == ']');
    }
}
