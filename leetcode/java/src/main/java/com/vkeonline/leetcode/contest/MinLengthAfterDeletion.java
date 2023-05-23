/*
 * Copyright (c) 2023 HyTrust Inc. All rights reserved.
 */

package com.vkeonline.leetcode.contest;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author csgear
 */
public class MinLengthAfterDeletion {
    public int minLength(String s) {
        Deque<Character> stack = new ArrayDeque<Character>() ;
        for(Character c : s.toCharArray()) {
            if (!stack.isEmpty()) {
                char head = stack.peek();
                if( (head == 'A' && c == 'B') || (head == 'C' && c == 'D')) {
                    stack.pop() ;
                    continue;
                }
            }
            stack.push(c) ;
        }
        return stack.size() ;
    }
}
