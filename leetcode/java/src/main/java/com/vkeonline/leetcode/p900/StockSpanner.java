package com.vkeonline.leetcode.p900;

import java.util.Stack;

/**
 * Leetcode [M]: 901. Online Stock Span
 * @author csgear
 */
public class StockSpanner {
    Stack<int[] > spans ;

    public StockSpanner() {
        spans = new Stack<>();
    }

    public int next(int price) {
        int span = 1 ;
        while(! spans.isEmpty() && price >= spans.peek()[0]) {
            span += spans.peek()[1] ;
            spans.pop() ;
        }
        spans.push(new int[] {price, span}) ;

        return span ;
    }
}
