package com.vkeonline.leetcode.p100;

import com.vkeonline.leetcode.common.ListNode;
import com.vkeonline.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Leetcode [M]:
 * 109. Convert Sorted List to Binary Search Tree
 * @author csgear
 */
public class ConvertSortedListToBST {
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> list = convertListToArray(head);
        return helper(list, 0, list.size() - 1);
    }

    private TreeNode helper(List<Integer> list, int left, int right) {
        if (left > right) {
            return null;
        }

        int middle = (left + right) / 2;
        TreeNode node = new TreeNode(list.get(middle));

        if (left == right) {
            return node;
        }
        node.left = helper(list, left, middle - 1);
        node.right = helper(list, middle + 1, right);

        return node;
    }

    private List<Integer> convertListToArray(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        return list ;
    }
}
