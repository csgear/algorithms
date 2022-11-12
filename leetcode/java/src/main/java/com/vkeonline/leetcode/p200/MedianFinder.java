package com.vkeonline.leetcode.p200;

import java.util.Collections;
import java.util.PriorityQueue;

class MedianFinder {
    // A min-heap to store the larger half of the input numbers
    private PriorityQueue<Integer> largePartHeap = new PriorityQueue<>();
    // A max-heap to store the smaller half of the input numbers
    private PriorityQueue<Integer> smallPartHeap = new PriorityQueue<>(Collections.reverseOrder());
    public MedianFinder() {
    }
    public void addNum(int num) {
        smallPartHeap.offer(num);
        largePartHeap.offer(smallPartHeap.poll());
        if (largePartHeap.size() > smallPartHeap.size()) {
            smallPartHeap.offer(largePartHeap.poll());
        }
    }
    public double findMedian() {
        if (smallPartHeap.size() > largePartHeap.size()) {
            return smallPartHeap.peek();
        }
        return (largePartHeap.peek() + smallPartHeap.peek()) / 2.0d;
    }
}