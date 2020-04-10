package com.vkeonline.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class _215 {
    public static void main(String[] args) {
        Solution1 solution1 = new _215().new Solution1() ;
        int[] nums = {3,2,1,5,6,4} ;
        System.out.println(solution1.findKthLargest(nums, 2)) ;
    }
    class Solution1 {
        public int findKthLargest(int[] nums, int k) {
            PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> o2-o1) ;
            for(int num: nums) queue.offer(num) ;
            for(int i = 0 ; i < k - 1 ; i++) queue.poll() ;
            return queue.poll() ;
        }
    }

    class Solution {
        public int findKthLargest(int[] nums, int k) {
            return quickSort(nums, 0, nums.length - 1, k);
        }

        private int quickSort(int[] nums, int start, int end, int k) {
            int N = end - start + 1;
            int index = start + (int) (Math.random() * N);
            int pivot = nums[index];
            swap(nums, index, end);
            int i = start;
            for (int j = start; j < end; j++) {
                if (nums[j] <= pivot) {
                    swap(nums, i, j);
                    i++;
                }
            }
            swap(nums, end, i);
            int count = end - i + 1;
            if (k == count) {
                return pivot;
            } else if (k < count) {
                return quickSort(nums, i + 1, end, k);
            } else {
                return quickSort(nums, start, i - 1, k - count);
            }
        }

        private void swap(int[] nums, int i, int j) {
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
        }
    }
}
