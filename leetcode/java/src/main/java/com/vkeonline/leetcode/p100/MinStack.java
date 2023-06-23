package com.vkeonline.leetcode.p100;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

/**
 * Leetcode [M]: 155. Min Stack
 * @author csgear
 */

/**
 *  Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 *
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 */
public class MinStack {
    Stack<int[]> stack = new Stack<>();

    /** initialize your data structure here. */
    public MinStack() {
    }

    public void push(int x) {
        int min = (stack.isEmpty()) ? x : Math.min(x, getMin());
        stack.push(new int[] {x, min});
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek()[0];
    }

    public int getMin() {
        return stack.peek()[1];
    }

}

class MinStack_Queue {
    Queue<Integer> q = new PriorityQueue<>();
    Stack<Integer> st = new Stack<>();

    public void push(int x) {
        st.push(x);
        q.offer(x);
    }

    public void pop() {
        int p = st.pop();
        if (p == getMin())
        {
            q.poll();
        }
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return q.peek();
    }
}
