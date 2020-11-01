package com.vkeonline.leetcode.year2020.may;

import java.util.Stack;

/**
 * @author csgear
 */
public class RemoveKDigits {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>() ;
        int remain = k ;

        for(char c: num.toCharArray()) {
            while( ! stack.isEmpty() && remain > 0 && stack.peek() > c) {
                stack.pop() ;
                remain-- ;
            }
            stack.push(c) ;
        }

        for(int i = 0 ; i < remain ; i++) {
            stack.pop() ;
        }

        StringBuilder sb = new StringBuilder() ;

        while(stack.size() > 0) {
           sb.insert(0, stack.pop()) ;
        }

        while (sb.length() > 0 && sb.charAt(0) == '0')
        {
            sb.deleteCharAt(0) ;
        }

        return sb.toString() ;
    }
}
