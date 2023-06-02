package com.vkeonline.leetcode.p900;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Leetcode [M]: 973. K Closest Points to Origin
 * @author csgear
 */
public class KClosestPointsOrigin {
    public int[][] kClosestSorting(int[][] points, int K) {
        int N = points.length;
        int[] dists = new int[N];
        for (int i = 0; i < N; ++i) {
            dists[i] = dist(points[i]);
        }

        Arrays.sort(dists);
        int distK = dists[K - 1];

        int[][] ans = new int[K][2];
        int t = 0;
        for (int[] point : points) {
            if (dist(point) <= distK) {
                ans[t++] = point;
            }
        }
        return ans;
    }

    public int dist(int[] point) {
        return point[0] * point[0] + point[1] * point[1];
    }


    public int dist(int i) {
        return points[i][0] * points[i][0] + points[i][1] * points[i][1];
    }

    int[][] points;

    public int[][] kClosest(int[][] points, int K) {
        this.points = points;
        sort(0, points.length - 1, K);
        return Arrays.copyOfRange(points, 0, K);
    }

    public void sort(int i, int j, int K) {
        if (i >= j) {
            return;
        }
        int k = ThreadLocalRandom.current().nextInt(i, j);
        swap(i, k);

        int mid = partition(i, j);
        int leftLength = mid - i + 1;
        if (K < leftLength) {
            sort(i, mid - 1, K);
        }
        else if (K > leftLength) {
            sort(mid + 1, j, K - leftLength);
        }
    }

    public int partition(int i, int j) {
        int oi = i;
        int pivot = dist(i);
        i++;

        while (true) {
            while (i < j && dist(i) < pivot) {
                i++;
            }
            while (i <= j && dist(j) > pivot) {
                j--;
            }
            if (i >= j) {
                break;
            }
            swap(i, j);
        }
        swap(oi, j);
        return j;
    }


    public void swap(int i, int j) {
        int t0 = points[i][0], t1 = points[i][1];
        points[i][0] = points[j][0];
        points[i][1] = points[j][1];
        points[j][0] = t0;
        points[j][1] = t1;
    }
}
