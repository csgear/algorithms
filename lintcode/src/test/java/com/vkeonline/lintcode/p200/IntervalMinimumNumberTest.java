package com.vkeonline.lintcode.p200;

import com.vkeonline.lintcode.common.Interval;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IntervalMinimumNumberTest {
    IntervalMinimumNumber intervalMinimumNumber = new IntervalMinimumNumber() ;

    @Test
    void intervalMinNumber() {

        int[] input = {1,2,7,8,5} ;

        List<Interval> queries = new ArrayList<>() ;

        queries.add(new Interval(1,2)) ;
        queries.add(new Interval(0,4)) ;
        queries.add(new Interval(2,4)) ;

        int[] expected = {2,1,5} ;

        List<Integer> result = intervalMinimumNumber.intervalMinNumber(input, queries) ;

        assertArrayEquals(expected, result.stream().mapToInt(i->i).toArray()) ;

    }
}