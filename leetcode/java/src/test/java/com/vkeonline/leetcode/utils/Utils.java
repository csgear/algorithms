

package com.vkeonline.leetcode.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author csgear
 */
public class Utils {
    static public <T> List<T> twoDimArrayToSingleList(T[][] twoDArray) {
        List<T> list = new ArrayList<T>();
        for (T[] array : twoDArray) {
            list.addAll(Arrays.asList(array));
        }
        return list;
    }

    static public List<List<Integer>> twoDimArrayToList(int[][] twoDimArray) {
        return Arrays.stream(twoDimArray).map(
                internalArray -> Arrays.stream(internalArray)
                                       .boxed()
                                       .collect(Collectors.toList())
        ).collect(Collectors.toList());
    }
}
