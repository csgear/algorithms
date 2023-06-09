package com.vkeonline.microsoft;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiaojun.yang
 */
class MicrosoftTest {

    @Test
    void testComputeSimilarities() {
        int[][] docs = {
                { 14, 15, 100, 9, 3 },
                { 32, 1, 9, 3, 5 },
                { 15, 29, 2, 6, 8, 7 },
                { 7, 10 }
        };
        List<String> expected =
                List.of(
                        "0,1: 0.2500",
                        "0,2: 0.1000",
                        "2,3: 0.1429"
                );

        ComputeSimilarities computeSimilarities = new ComputeSimilarities();

        assertArrayEquals(expected.toArray(),
                computeSimilarities.computeSimilarities(docs).toArray());

    }

    @Test
    void testIntersection() {
        ComputeSimilarities computeSimilarities = new ComputeSimilarities() ;
        int[] doc1 = { 32, 1, 9, 3, 5 };
        int[] doc2 =  { 14, 15, 100, 9, 3 } ;
        Arrays.sort(doc1) ;
        Arrays.sort(doc2);
        int expected = 2 ;
        assertEquals(expected,
                computeSimilarities.intersection(doc1, doc2));
    }


}