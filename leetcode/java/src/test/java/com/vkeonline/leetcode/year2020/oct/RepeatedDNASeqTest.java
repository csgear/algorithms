package com.vkeonline.leetcode.year2020.oct;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RepeatedDNASeqTest {

    @Test
    void findRepeatedDnaSequences() {
        RepeatedDNASeq repeatedDNASeq = new RepeatedDNASeq() ;
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT" ;
        String[] expected = {"AAAAACCCCC", "CCCCCAAAAA"} ;
        List<String> result = repeatedDNASeq.findRepeatedDnaSequences(s) ;
        // compare 2 arrays
        assertArrayEquals(expected, result.toArray());
        // compare 2 lists
        assertEquals(Arrays.asList(expected), result);
    }
}