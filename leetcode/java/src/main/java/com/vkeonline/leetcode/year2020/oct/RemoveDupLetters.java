package com.vkeonline.leetcode.year2020.oct;

import java.util.Stack;

/**
 * @author csgear
 */
public class RemoveDupLetters {
    public String removeDuplicateLetters(String s) {
        boolean[] visited  = new boolean[26] ;
        Stack<Integer> stack = new Stack<>() ;
        int[] counter = new int[26] ;

        for(char c: s.toCharArray()) {
            counter[c - 'a']++ ;
        }

        for (int i = 0; i < s.length(); i++) {
            int cur = s.charAt(i) - 'a' ;
            counter[cur]-- ;
            if(visited[cur]) {
                continue;
            }

            while(!stack.isEmpty() && stack.peek() > cur && counter[stack.peek()] > 0) {
                visited[stack.peek()] = false ;
                stack.pop() ;
            }

            stack.push(cur) ;
            visited[cur] = true ;
        }

        StringBuilder sb = new StringBuilder();

        for(int x: stack) {
            sb.append((char) (x + 'a')) ;
        }

        return sb.toString() ;
    }
}
