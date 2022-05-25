package com.vkeonline.leetcode.p1200;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Leetcode [M]: 1209. Remove All Adjacent Duplicates in String II
 * @author csgear
 */
public class RemoveAllAdjacentDuplicates {
    static class Pair {
        int cnt ;
        char ch ;
        public Pair(int cnt, char ch) {
            this.cnt = cnt ;
            this.ch = ch ;
        }
    }
    public String removeDuplicates(String s, int k) {
        Deque<Pair> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            if(stack.isEmpty() || s.charAt(i) != stack.peek().ch) {
                stack.push(new Pair(1, s.charAt(i))) ;
            }
            else {
                if (++stack.peek().cnt == k) {
                    stack.pop();
                }
            }
        }

        StringBuilder sb = new StringBuilder() ;
        while(!stack.isEmpty()) {
            Pair pair = stack.pop() ;
            sb.append(String.valueOf(pair.ch).repeat(Math.max(0, pair.cnt))) ;
        }

        return sb.reverse().toString() ;
    }

}
