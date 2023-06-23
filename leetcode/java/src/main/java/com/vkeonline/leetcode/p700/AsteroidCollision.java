package com.vkeonline.leetcode.p700;

import java.util.Stack;

/**
 * Leetcode [M]: 735. Asteroid Collision
 * @author csgear
 */
public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;

        Stack<Integer> st = new Stack<>();

        for (int asteroid : asteroids) {
            if (asteroid < 0) {
                while (!st.empty() && st.peek() > 0 && st.peek() < -asteroid) {
                    st.pop();
                }
                if (!st.empty() && st.peek() > -asteroid) {
                    continue;
                }
                if (!st.empty() && st.peek() == -asteroid) {
                    st.pop();
                    continue;
                }
            }
            st.push(asteroid);
        }

        int[] arr = new int[st.size()];
        int i = arr.length - 1;

        while (!st.empty()) {
            arr[i] = st.pop();
            i--;
        }
        return arr;
    }
}
