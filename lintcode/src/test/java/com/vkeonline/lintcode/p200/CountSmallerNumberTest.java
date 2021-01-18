package com.vkeonline.lintcode.p200;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountSmallerNumberTest {

    CountSmallerNumber countSmallerNumber = new CountSmallerNumber();

    @Test
    void countOfSmallerNumber() {
        int[] array = {1, 2, 7, 8, 5};
        int[] queries = {1, 8, 5};
        List<Integer> expected = Arrays.stream(new int[]{0, 4, 2}).boxed().collect(Collectors.toList());

        assertEquals(expected, countSmallerNumber.countOfSmallerNumber(array, queries));
    }
}