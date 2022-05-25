////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// File: MyStack.java
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Author: xiaoyang
//
// Nokia - Confidential
// Do not use, distribute, or copy without consent of Nokia.
// Copyright (c) 2022 Nokia. All rights reserved.
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package com.vkeonline.leetcode.p200;

import java.util.LinkedList;
import java.util.Queue;


public class MyStack {
    Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.add(x);
        for(int i=0; i<q.size()-1; i++) {
            q.add(q.remove());
        }
    }

    public int pop() {
        return q.remove();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }
}
