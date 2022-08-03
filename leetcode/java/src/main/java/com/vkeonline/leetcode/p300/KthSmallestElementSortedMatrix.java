package com.vkeonline.leetcode.p300;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Leetcode [M]: 378. Kth Smallest Element in a Sorted Matrix
 *
 * @author csgear
 */
public class KthSmallestElementSortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));

        for (int i = 0; i < m; i++) {
            queue.offer(new int[] { matrix[i][0], i, 0 });
        }

        for (int i = 0; i < k - 1; i++) {
            int[] cur = queue.poll();
            if (cur[2] != n - 1) {
                queue.offer(new int[] { matrix[cur[1]][cur[2] + 1], cur[1], cur[2] + 1 });
            }
        }

        return queue.poll()[0];
    }

    public int kthSmallestBinarySearch(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        int low = matrix[0][0];
        int high = matrix[m - 1][n - 1];

        while (low < high) {
            int middle = low + (high - low) / 2;
            int cnt = count(matrix, middle, m, n);
            if (cnt >= k) {
                high = middle;
            } else {
                low = middle + 1;
            }
        }
        return low;
    }

    private int count(int[][] matrix, int v, int m, int n) {
        int j = n - 1;
        int count = 0;
        for (int i = 0; i < m; i++) {
            while (j >= 0 && matrix[i][j] > v) {
                j--;
            }
            count += j + 1;
        }
        return count;
    }
}
