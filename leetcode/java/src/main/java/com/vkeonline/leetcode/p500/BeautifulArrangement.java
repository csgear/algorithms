package com.vkeonline.leetcode.p500;

/**
 * Leetcode [M]: 526. Beautiful Arrangement
 * @author csgear
 */
public class BeautifulArrangement {
    int count = 0;
    public int countArrangement(int length) {
        boolean[] visited = new boolean[length + 1];
        calculate(length, 1, visited);
        return count;
    }
    public void calculate(int length, int pos, boolean[] visited) {
        if (pos > length) {
            count++;
        }
        for (int i = 1; i <= length; i++) {
            if (!visited[i] && (pos % i == 0 || i % pos == 0)) {
                visited[i] = true;
                calculate(length, pos + 1, visited);
                visited[i] = false;
            }
        }
    }
}

