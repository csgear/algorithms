package com.vkeonline.leetcode.p300;

import java.util.List;

/**
 * Leetcode [M]: 341. Flatten Nested List Iterator
 *
 * @author csgear
 */
public interface NestedInteger {
    boolean isInteger();

    Integer getInteger();

    List<NestedInteger> getList();
}
