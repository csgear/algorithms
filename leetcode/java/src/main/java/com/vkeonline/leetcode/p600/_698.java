package com.vkeonline.leetcode.p600;

public class _698 {
    class Solution {
        public boolean canPartitionKSubsets(int[] nums, int k) {
            int sum = 0;
            for (int num : nums) sum += num;
            if (sum % k != 0 || k <= 0) return false;

            boolean[] visited = new boolean[nums.length];

            visited[0] = true;

            return dfs(nums, visited, nums[0], 1, sum / k, 1);
        }

        private boolean dfs(int[] nums, boolean[] visited, int cur, int index, int target, int start) {
            if (cur == target) {
                cur = 0;
                start = 0;
            }

            if (index == nums.length) {
                return cur == nums.length;
            }

            for (int i = start; i < nums.length; i++) {
                if (!visited[i] && cur + nums[i] <= target) {
                    visited[i] = true;
                    if (dfs(nums, visited, cur + nums[i], index + 1, target, i + 1))
                        return true;
                    visited[i] = false;
                }
            }

            return false;
        }
    }
}
