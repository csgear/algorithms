package com.vkeonline.lintcode.p400;

/**
 * @author csgear
 */
public class KClosestElements {
    public int[] kClosestNumbers(int[] data, int target, int k) {
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
