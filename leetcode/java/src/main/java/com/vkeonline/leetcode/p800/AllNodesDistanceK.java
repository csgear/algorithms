

package com.vkeonline.leetcode.p800;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.vkeonline.leetcode.common.TreeNode;

/**
 * Leetcode [M]: 863. All Nodes Distance K in Binary Tree
 * @author csgear
 */
public class AllNodesDistanceK {
    private final Map<TreeNode, TreeNode> parent = new HashMap<>() ;
    private final List<Integer> ans = new ArrayList<>() ;
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {

        if(k == 0) {
            ans.add(target.val);
        }

        findParent(root) ;

        Deque<TreeNode> queue = new LinkedList<>() ;

        Set<TreeNode> visited = new HashSet<>() ;

        queue.offer(target) ;
        visited.add(target) ;
        int level = 0 ;
        while(! queue.isEmpty()) {
            level++;
            for (int i = queue.size(); i > 0; i--) {
                TreeNode x = queue.peek() ;
                queue.poll() ;
                List<TreeNode> ys = new ArrayList<>();
                if(parent.containsKey(x)) {
                    ys.add(parent.get(x));
                }
                ys.add(x.left);
                ys.add(x.right);

                for(TreeNode y: ys) {
                    if(y != null && !visited.contains(y)) {
                        if(level == k) {
                            ans.add(y.val);
                        }
                        visited.add(y) ;
                        queue.offer(y) ;
                    }
                }
            }
        }
        return ans ;
    }

    private void findParent(TreeNode node) {
        if (node != null) {
            if (node.left != null) {
                parent.put(node.left, node);
            }

            if (node.right != null) {
                parent.put(node.right, node);
            }

            findParent(node.left);
            findParent(node.right);
        }
    }
}
