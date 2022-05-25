package com.vkeonline.leetcode.p300;

import java.util.*;

/**
 * Leetcode [M]: 341. Flatten Nested List Iterator
 *
 * @author csgear
 */

public class FlattenNestedListIterator {

    static class Solution1 implements Iterator<Integer> {
        private final List<Integer> data = new ArrayList<>();
        private int current = 0;

        public Solution1(List<NestedInteger> nestedList) {
            flattenList(nestedList);
        }

        private void flattenList(List<NestedInteger> nestedList) {
            for (NestedInteger nestedInteger : nestedList) {
                if (nestedInteger.isInteger()) {
                    data.add(nestedInteger.getInteger());
                } else {
                    flattenList(nestedInteger.getList());
                }
            }
        }

        @Override
        public Integer next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return data.get(current++);
        }

        @Override
        public boolean hasNext() {
            return current < data.size();
        }
    }

    static class Solution2 implements Iterator<Integer> {
        private final Deque<List<NestedInteger>> listStack = new ArrayDeque<>();
        private final Deque<Integer> indexStack = new ArrayDeque<>();

        public Solution2(List<NestedInteger> nestedList) {
            listStack.addFirst(nestedList);
            indexStack.addFirst(0);
        }

        @Override
        public Integer next() {
            if (!hasNext()) throw new NoSuchElementException();
            int currentPosition = indexStack.removeFirst();
            indexStack.addFirst(currentPosition + 1);
            return listStack.peekFirst().get(currentPosition).getInteger();
        }

        @Override
        public boolean hasNext() {
            makeStackTopAnInteger();
            return !indexStack.isEmpty();
        }

        private void makeStackTopAnInteger() {
            while (!indexStack.isEmpty()) {
                // If the top list is used up, pop it and its index.
                if (indexStack.peekFirst() >= listStack.peekFirst().size()) {
                    indexStack.removeFirst();
                    listStack.removeFirst();
                    continue;
                }

                // Otherwise, if it's already an integer, we don't need to do anything.
                if (listStack.peekFirst().get(indexStack.peekFirst()).isInteger()) {
                    break;
                }

                // Otherwise, it must be a list. We need to update the previous index
                // and then add the new list with an index of 0.
                listStack.addFirst(listStack.peekFirst().get(indexStack.peekFirst()).getList());
                indexStack.addFirst(indexStack.removeFirst() + 1);
                indexStack.addFirst(0);
            }
        }
    }
}