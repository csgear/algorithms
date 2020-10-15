package com.vkeonline.leetcode.sept;

/**
 * @author csgear
 */
public class MaxXORArray {

    private static class TrieNode {
        final TrieNode[] children;

        TrieNode() {
            children = new TrieNode[2];
        }
    }

    private TrieNode root;

    public int findMaximumXOR(int[] nums) {
        root = new TrieNode();

        TrieNode curr;

        for (int num : nums) {
            curr = root;
            for (int i = 31; i >= 0; --i) {
                int bit = getIthBit(num, i);
                if (curr.children[bit ^ 1] == null) {
                    curr.children[bit ^ 1] = new TrieNode();
                }

                curr = curr.children[bit ^ 1];
            }
        }
        int ans = Integer.MIN_VALUE;

        for (int num : nums) {
            curr = root;

            int rst = 0;
            for (int i = 31; i >= 0; --i) {
                int bit = getIthBit(num, i);
                if (curr.children[bit] != null) {
                    curr = curr.children[bit];

                    rst += (1 << i);
                } else {
                    curr = curr.children[bit ^ 1];
                }
            }
            ans = Math.max(ans, rst);
            if (ans == Integer.MAX_VALUE) {
                break;
            }
        }
        return ans;
    }

    private int getIthBit(int num, int pos) {
        return ((num >> pos) & 1);
    }
}
