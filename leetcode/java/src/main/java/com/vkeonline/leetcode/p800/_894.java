package com.vkeonline.leetcode.p800;

import com.vkeonline.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _894 {
    class Solution {
        public List<TreeNode> allPossibleFBT(int N) {
            if (N % 2 == 0) return new ArrayList<>();
            if (N == 1) return Arrays.asList(new TreeNode(0));
            List<TreeNode> ans = new ArrayList<>();
            for (int i = 1; i < N; i += 2) {
                for (TreeNode l : allPossibleFBT(i)) {
                    for (TreeNode r : allPossibleFBT(N - i - 1)) {
                        TreeNode root = new TreeNode(0);
                        root.left = l;
                        root.right = r;
                        ans.add(root);
                    }
                }
            }
            return ans;
        }
    }
}
