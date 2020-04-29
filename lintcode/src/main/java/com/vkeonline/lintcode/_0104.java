package com.vkeonline.lintcode;

import com.vkeonline.lintcode.common.ListNode;

import java.util.* ;

public class _0104 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>() ;
        List<Integer> list = new ArrayList<>() ;
        Queue<Integer> queue = new ArrayDeque<>() ;
        Set<Integer> set = new HashSet<>() ;


    }
    /**
     * Definition for ListNode.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int val) {
     *         this.val = val;
     *         this.next = null;
     *     }
     * }
     */
    public class Solution {
        /**
         * @param lists: a list of ListNode
         * @return: The head of one sorted list.
         */
        public ListNode mergeKLists(List<ListNode> lists) {
            // write your code here
            if( lists == null || lists.size() == 0) return null ;

            Queue<ListNode> queue = new PriorityQueue<>(
                    Comparator.comparingInt(n -> n.val)) ;

            for (ListNode list : lists) {
                if (list != null) queue.offer(list);
            }

            ListNode dummy = new ListNode(0) ;
            ListNode curr = dummy ;

            while(! queue.isEmpty()) {
                ListNode tmp = queue.poll() ;
                curr.next = tmp ;
                curr = tmp ;
                if (curr.next != null) {
                    queue.add(curr.next);
                }
            }

            return dummy.next ;
        }

        private ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode dummy = new ListNode(0);

            ListNode curr = dummy;

            while (list1 != null && list2 != null) {
                if (list1.val < list2.val) {
                    curr.next = list1;
                    curr = list1;
                    list1 = list1.next;
                } else {
                    curr.next = list2;
                    curr = list2;
                    list2 = list2.next;
                }
            }

            if (list1 != null) {
                curr.next = list1;
            } else {
                curr.next = list2;
            }

            return dummy.next;
        }
    }

}
