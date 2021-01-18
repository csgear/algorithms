package com.vkeonline.lintcode.p1200;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountSmallerAfterTest {
    CountSmallerAfter countSmallerAfter = new CountSmallerAfter();

    @Test
    void countSmaller() {
        int[] input = {5, 2, 6, 1};
        List<Integer> expected = Arrays.stream(new int[]{2, 1, 1, 0})
                .boxed().collect(Collectors.toList());

        assertEquals(expected, countSmallerAfter.countSmaller(input));
    }
}