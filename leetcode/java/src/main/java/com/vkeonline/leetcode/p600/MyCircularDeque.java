

package com.vkeonline.leetcode.p600;

/**
 * Leetcode [M]: 641. Design Circular Deque
 * @author csgear
 */
public class MyCircularDeque {
    private int front, end ;
    private final int capacity ;
    final private int[] data ;
    public MyCircularDeque(int k) {
        front = end = 0 ;
        capacity = k + 1 ;
        data = new int[k + 1] ;

    }

    public boolean insertFront(int value) {
        if(isFull()) {
            return false ;
        }
        front = (front - 1 + capacity) % capacity ;
        data[front] = value ;
        return true ;
    }

    public boolean insertLast(int value) {
        if(isFull()) {
            return false ;
        }
        data[end] = value ;
        end = (end + 1) % capacity ;
        return true ;

    }

    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }
        front = (front + 1) % capacity;
        return true;
    }

    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }
        end = (end - 1 + capacity) % capacity;
        return true;
    }

    public int getFront() {
        if (isEmpty()) {
            return -1;
        }
        return data[front];
    }

    public int getRear() {
        if (isEmpty()) {
            return -1;
        }
        return data[(end - 1 + capacity) % capacity];
    }

    public boolean isEmpty() {
        return end == front;
    }

    public boolean isFull() {
        return (end + 1) % capacity == front;
    }
}
