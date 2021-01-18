package com.vkeonline.lintcode.p400;

import java.util.Stack;

/**
 * Lint code: 423. Valid Parentheses
 * @author csgear
 */
public class ValidParentheses {
    public boolean isValidParentheses(String s) {
        Stack<Character> stack = new Stack<>() ;

        for(char c: s.toCharArray()) {
            if( c == '{' || c == '[' || c == '(') {
                stack.push(c) ;
            }
            else {
                if(! stack.isEmpty() && isValid(stack.peek(), c)){
                    stack.pop() ;
                }
                else {
                    return false ;
                }
            }
        }

        return stack.isEmpty() ;
    }

    private boolean isValid(char c1, char c2) {
        return (c1 == '(' && c2 == ')') || (c1 == '{' && c2 == '}') || (c1 == '[' && c2 == ']') ;
    }
}
