package com.vkeonline.lintcode.p1700;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class CountDuplicatesTest {

    @Test
    void countDuplicates() {
        CountDuplicates countDuplicates = new CountDuplicates() ;
        int[] nums = {1, 2, 2, 3, 3, 3} ;
        List<Integer> data = Arrays.stream(nums).boxed().collect(Collectors.toList());
        System.out.println(countDuplicates.CountDuplicates(data ));
    }
}