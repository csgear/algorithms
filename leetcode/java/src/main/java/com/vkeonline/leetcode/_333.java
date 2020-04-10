package com.vkeonline.leetcode;

public class _333 {
    public class Solution1 {
        class ExtraInfoNode {
            int count;
            int min;
            int max;
            boolean isBST;

            ExtraInfoNode() {
                isBST = true;
                this.min = Integer.MAX_VALUE;
                this.max = Integer.MIN_VALUE;
                this.count = 0;
            }
        }

        public int largestBSTSubtree(TreeNode root) {
            return dfs(root).count;
        }

        private ExtraInfoNode dfs(TreeNode node) {
            if (node == null) {
                return new ExtraInfoNode();
            }
            ExtraInfoNode left = dfs(node.left);
            ExtraInfoNode right = dfs(node.right);
            ExtraInfoNode current = new ExtraInfoNode();
            current.min = Math.min(node.val, left.min);
            current.max = Math.max(node.val, right.max);
            if (left.isBST && right.isBST && node.val >= left.max && node.val <= right.min) {
                current.isBST = true;
                current.count = left.count + right.count + 1;
            } else {
                current.isBST = false;
                current.count = Math.max(left.count, right.count);
            }

            return current;
        }
    }

    public class Solution {
        public class SuperNode {
            int ans;
            int small, large;
            boolean isBST;

            public SuperNode() {
                ans = 0;
                isBST = true;
                small = Integer.MAX_VALUE;
                large = -Integer.MAX_VALUE;
            }
        }

        public int largestBSTSubtree(TreeNode root) {
            return dfs(root).ans;
        }

        public SuperNode dfs(TreeNode node) {
            if (node == null) {
                return new SuperNode();
            }
            SuperNode now = new SuperNode();
            SuperNode left = dfs(node.left);
            SuperNode right = dfs(node.right);
//            if (left.small < node.val) {
//                now.small = left.small;
//            } else {
//                now.small = node.val;
//            }
            now.small = Math.min(left.small, node.val);
            now.large = Math.max(right.large, node.val);
            if (left.isBST && right.isBST && left.large <= node.val && right.small >= node.val) {
                now.ans = left.ans + right.ans + 1;
                now.isBST = true;
            } else {
                now.ans = Math.max(left.ans, right.ans);
                now.isBST = false;
            }
            return now;
        }
    }
}
