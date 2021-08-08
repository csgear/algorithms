package com.vkeonline.leetcode.p100;

import com.vkeonline.leetcode.common.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Leetcode [M]: 199. Binary Tree Right Side View
 * @author csgear
 */
public class BSTRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        dfsHelper(root, result, 0);
        return result;
    }

    private void dfsHelper(TreeNode current, List<Integer> result, int depth) {
        if(current == null) {
            return ;
        }

        if(result.size() == depth) {
            result.add(current.val) ;
        }

//        (1) the traverse of the tree is NOT standard pre-order traverse. It checks the RIGHT node first and then the LEFT
//        (2) the line to check currDepth == result.size() makes sure the first element of that level will be added to the result list
//        (3) if reverse the visit order, that is first LEFT and then RIGHT, it will return the left view of the tree.
        dfsHelper(current.right, result, depth+1);
        dfsHelper(current.left, result, depth+1);
    }

    public List<Integer> rightSideViewBFS(TreeNode root) {
        if (root == null)
        {
            return new ArrayList<>();
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        List<Integer> res = new ArrayList<>();

        while(!queue.isEmpty()){
            int size = queue.size();

            while (size-- > 0){
                TreeNode cur = queue.poll();
                if (size == 0) {
                    res.add(cur.val);
                }
                if (cur.left != null)
                {
                    queue.offer(cur.left);
                }
                if (cur.right != null)
                {
                    queue.offer(cur.right);
                }
            }
        }

        return res;
    }
}
