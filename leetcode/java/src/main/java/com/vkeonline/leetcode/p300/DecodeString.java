package com.vkeonline.leetcode.p300;

import java.util.Stack;

/**
 * Leetcode [M]: 394. Decode String
 * @author csgear
 */
public class DecodeString {
    public String decodeString(String s) {
        Stack<String> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c != ']') {
                stack.push(c + "");
            } else {
                StringBuilder temp = new StringBuilder();
                StringBuilder str = new StringBuilder();

                while (!stack.isEmpty() && stack.peek().charAt(0) != '[') {
                    temp.insert(0, stack.pop());
                }

                stack.pop();
                StringBuilder num = new StringBuilder();
                while (!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0))) {
                    num.insert(0, stack.pop());
                }

                int time = Integer.parseInt(num.toString());
                str.append(String.valueOf(temp).repeat(Math.max(0, time)));
                if (str.length() > 0) {
                    stack.push(str.toString());
                }
            }
        }
        StringBuilder res = new StringBuilder();
        while (!stack.isEmpty()) {
            res.insert(0, stack.pop());
        }
        return res.toString();
    }
}
