package com.vkeonline.leetcode.thirtydays;

public class DiameterOfBinaryTree {

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

    int ans;

    public int diameterOfBinaryTree(TreeNode root) {
        ans = 1;
        depth(root);
        return ans - 1;
    }


    public int depth(TreeNode node) {
        if (node == null) return 0;
        int L = depth(node.left);
        int R = depth(node.right);
        ans = Math.max(ans, L+R+1);
        return Math.max(L, R) + 1;
    }

    static int height(TreeNode node) {
          if(node == null) return 0 ;

          return (1 + Math.max(height(node.left), height(node.right))) ;
    }
}
