package com.vkeonline.lintcode.p400;

/**
 * Lintcode: 460 Find K Closest Elements
 *
 * @author csgear
 */
public class KClosestElements {

    public int[] kClosestNumbers(int[] data, int target, int k) {
        // using 2 pointers to get k elements
        int left = binarySearch(data, target) ;
        int right = left + 1 ;
        int[] result = new int[k] ;

        for (int i = 0; i < k; i++) {
            if(left < 0) {
                result[i] = data[right++] ;
            }
            else if(right > data.length - 1) {
                result[i] = data[left--] ;
            }
            else if( target - data[left] <= data[right] - target) {
                result[i] = data[left--] ;
            }
            else {
                result[i] = data[right++] ;
            }
        }
        return result ;
    }


    private int binarySearch(int[] data, int target) {
        int left = 0 ;
        int right = data.length - 1 ;
        while(left + 1 < right) {
            int middle = (right + left) / 2 ;
            if(data[middle] == target) {
                return middle ;
            }
            else if (data[middle] > target){
                right = middle ;
            }
            else {
                left = middle ;
            }
        }

        return left ;
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
