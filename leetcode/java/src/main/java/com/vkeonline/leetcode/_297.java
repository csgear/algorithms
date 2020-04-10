package com.vkeonline.leetcode;

public class _297 {
    public class Codec {

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            if (root == null) return "";
            String left = serialize(root.left);
            String right = serialize(root.right);
            StringBuilder sb = new StringBuilder();
            sb.append("[").append(left).append(root.val).append(right).append("]");
            return sb.toString();
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            return helper(data, 0, data.length());
        }

        TreeNode helper(String data, int start, int end) {
            if (start >= end) return null;

            int i = start;
            int count = 0;

            char c = data.charAt(i);

            while (count != 1 || c == '[') {
                if (c == '[') count++;
                else if (c == ']') count--;
                i = i + 1;
                c = data.charAt(i);
            }

            int j = i;

            while (data.charAt(j) != '[' && data.charAt(j) != ']') {
                j++;
            }

            TreeNode root = new TreeNode(Integer.parseInt(data.substring(i, j)));

            root.left = helper(data, start + 1, i);
            root.right = helper(data, j, end - 1);
            return root;
        }
    }
}
