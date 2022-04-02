package com.vkeonline.codility;

import java.util.Arrays;

public class FindSmallest {
    public int solution(int[] data) {
        int[] sorted = Arrays.stream(data).filter(x -> x >= 1).sorted().toArray();
        int candidate = 1;
        for (int j : sorted) {
            if (j > candidate) {
                break;
            }
            candidate = j + 1;
        }
        return candidate;
    }
}
