package com.vkeonline.leetcode.year2020.sept;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author csgear
 */
public class LargestNumber {
    public String largestNumber(int[] nums) {

        String result = Arrays.stream(nums).
                mapToObj(String::valueOf).sorted((a, b) -> (b + a).
                compareTo(a + b)).collect(Collectors.joining());

        return result.startsWith("0") ? "0" : result;
    }
}
