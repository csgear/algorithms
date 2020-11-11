package com.vkeonline.lintcode.p400;

/**
 * Lintcode: 460 Find K Closest Elements
 *
 * @author csgear
 */
public class KClosestElements {
    public int[] kClosestNumbers(int[] data, int target, int k) {
        if (data == null || data.length == 0) {
            return null;
        }

        int left = binarySearch(data, target);
        int right = left + 1;

        int[] res = new int[k];

        for (int i = 0; i < k; i++) {
            if (isLeftCloser(data, target, left, right)) {
                res[i] = data[left--];
            } else {
                res[i] = data[right++];
            }
        }

        return res;
    }

    private boolean isLeftCloser(int[] data, int target, int l, int r) {
        if (l < 0)
        {
            return false;
        }

        if (r > data.length - 1)
        {
            return true;
        }

        return target - data[l] <= data[r] - target;
    }

    private int binarySearch(int[] A, int target) {
        int left = 0;
        int right = A.length - 1;

        while (left + 1 < right) {
            int mid = left + (right - left) / 2;

            if (A[mid] == target)
            {
                return mid;
            }
            else if (A[mid] > target)
            {
                right = mid;
            }
            else
            {
                left = mid;
            }
        }

        return left;
    }

    public int[] kClosestNumbers1(int[] data, int target, int k) {
        int[] result = new int[k];

        if (data == null || data.length == 0) {
            return data;
        }
        if (k > data.length) {
            return data;
        }

        int index = firstIndex(data, target);

        int start = index - 1;
        int end = index;
        for (int i = 0; i < k; i++) {
            if (start < 0) {
                result[i] = data[end++];
            } else if (end >= data.length) {
                result[i] = data[start--];
            } else {
                if (target - data[start] <= data[end] - target) {
                    result[i] = data[start--];
                } else {
                    result[i] = data[end++];
                }
            }
        }
        return result;
    }

    private int firstIndex(int[] data, int target) {
        int start = 0, end = data.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (data[mid] < target) {
                start = mid;
            } else if (data[mid] > target) {
                end = mid;
            } else {
                end = mid;
            }
        }

        if (data[start] >= target) {
            return start;
        }
        if (data[end] >= target) {
            return end;
        }
        return data.length;
    }
}
