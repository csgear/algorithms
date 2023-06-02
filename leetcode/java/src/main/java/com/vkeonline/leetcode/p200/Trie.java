package com.vkeonline.leetcode.p200;

/**
 * Leetcode [M]: 208. Implement Trie (Prefix Tree)
 * @author csgear
 */
public class Trie {
    private class Node {
        Node[] children = new Node[26]; // alphabet size
        boolean isEnd = false;
    }

    Node root;

    /**
     * Initialize your data structure here.
     */
    public Trie() {
        root = new Node();
    }

    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {
        Node current = root;
        for (char ch : word.toCharArray()) {
            if (current.children[ch - 97] == null)
            {
                current.children[ch - 97] = new Node();
            }
            current = current.children[ch - 97];
        }
        current.isEnd = true;
    }

    /**
     * Returns if the word is in the trie.
     */
    public boolean search(String word) {
        return isPrefixOrWord(word, false);
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        return isPrefixOrWord(prefix, true);
    }

    private boolean isPrefixOrWord(String word, boolean isPrefix) {
        Node current = root;
        for (char ch : word.toCharArray()) {
            if (current.children[ch - 97] != null)
            {
                current = current.children[ch - 97];
            }
            else {
                return false;
            }
        }
        return isPrefix || current.isEnd;
    }
}
