package com.vkeonline.leetcode;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

/**
 *  Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 *
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 */
public class MinStack {
    Queue<Integer> q = new PriorityQueue<Integer>();
    Stack<Integer> st = new Stack<>();

    public MinStack() {

    }

    public void push(int x) {
        st.push(x);
        q.offer(x);
    }

    public void pop() {
        int p = st.pop();
        if (p == getMin())
            q.poll();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return q.peek();
    }
}
