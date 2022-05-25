package com.vkeonline.codility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PickApplesTest {
    @Test
    public void testPickApple() {
        int[] A = {6, 1, 4, 6, 3, 2, 7, 4};
        int K = 3;
        int L = 2;
        PickApples pickApples = new PickApples();
        int expected = 24;
        assertEquals(expected, pickApples.solution(A, K, L));
    }

}