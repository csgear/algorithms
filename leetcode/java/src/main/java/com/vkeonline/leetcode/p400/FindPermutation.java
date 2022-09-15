

package com.vkeonline.leetcode.p400;

import java.util.Stack;

/**
 * Leetcode [M]: 484. Find Permutation
 * @author csgear
 */
public class FindPermutation    {
    public int[] findPermutation(String s) {
        int[] result = new int[s.length() + 1] ;
        Stack<Integer> stack = new Stack<>() ;
        int j = 0 ;
        for (int i = 1; i <= s.length(); i++) {
            if (s.charAt(i - 1) == 'I') {
                stack.push(i);
                while (!stack.isEmpty())
                    result[j++] = stack.pop();
            } else {
                stack.push(i);
            }
        }
        stack.push(s.length() + 1);
        while (!stack.isEmpty()) {
            result[j++] = stack.pop();
        }
        return result;
    }
}
