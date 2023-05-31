package com.vkeonline.leetcode.p200;

import java.util.*;

/**
 * Leetcode [M]: 239. Sliding Window Maximum
 * @author csgear
 */
public class SlidingWindowMaximum {
    public static void main(String[] args) {
        Solution solution = new SlidingWindowMaximum().new Solution();

        int nums[] = {1, -1};
        int k = 1;

        Arrays.stream(solution.maxSlidingWindow(nums, k)).forEach(System.out::println);
    }

    class MonotonicQueue {
        private Deque<Integer> queue = new ArrayDeque<>();

        public void push(int e) {
            while (!queue.isEmpty() && e >= queue.getLast()) queue.pollLast();
            queue.offerLast(e);
        }

        public void pop() {
            queue.pollFirst();
        }

        int max() {
            return queue.peekFirst();
        }
    }

    class Solution1
    {
        public int[] maxSlidingWindow(int[] nums, int k)
        {
            int n = nums.length;
            if (n == 0 || k == 0) return new int[0];
            int[] r = new int[n - k + 1];
            Deque<Integer> q = new ArrayDeque<>();

            for (int i = 0; i < n; ++i)
            {
                // remove the numbers out of range
                while (!q.isEmpty() && q.peekFirst() <= i - k) q.pollFirst();

                // remove the numbers which will not contribute to the max
                while (!q.isEmpty() && nums[q.peekLast()] <= nums[i]) q.pollLast();

                q.add(i);

                if (i >= k - 1)
                {
                    r[i - k + 1] = nums[q.peekFirst()];
                }
            }

            return r;
        }
    }

    class Solution {

        public int[] maxSlidingWindow(int[] nums, int k) {
            if (nums.length == 0) return new int[]{};

            MonotonicQueue queue = new MonotonicQueue();
            int[] result = new int[nums.length - k + 1];

            for(int i = 0 ; i < nums.length ; i++) {
                queue.push(nums[i]);
                if(i - k + 1 >= 0) {
                    result[i-k+1] = queue.max() ;
//                    if(nums[i-k+1] == queue.max()) queue.pop() ;
                }
            }
            return result;
        }
    }

    class Solution_Error1 {

        public int[] maxSlidingWindow(int[] nums, int k) {
            if (nums.length == 0) return new int[]{};

            TreeSet<Integer> set = new TreeSet<>();
            int[] result = new int[nums.length - k + 1];

            for (int i = 0; i < k; i++) set.add(nums[i]);

            result[0] = set.last();

            for (int i = k; i < nums.length; i++) {
                set.remove(nums[i - k]);
                set.add(nums[i]);
                result[i - k + 1] = set.last();
            }
            return result;
        }


    }

    class Solution_Error2 {
        public int[] maxSlidingWindow(int[] nums, int k) {
            PriorityQueue<Integer> queue = new PriorityQueue<Integer>((x, y) -> y - x);

            for (int i = 0; i < k; i++) {
                queue.offer(nums[i]);
            }

            List<Integer> list = new ArrayList<Integer>();

            for (int i = k; i < nums.length; i++) {
                int max = queue.poll();
                list.add(max);
                queue.add(nums[i]);
            }

            return list.stream().mapToInt(Integer::intValue).toArray();
        }
    }
}
