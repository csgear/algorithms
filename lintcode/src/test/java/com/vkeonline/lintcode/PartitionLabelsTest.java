package com.vkeonline.lintcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PartitionLabelsTest {

    @Test
    void testPartition() {
        PartitionLabels partitionLabels = new PartitionLabels() ;
        String s = "ababcbacadefegdehijhklij" ;
        List<Integer> result = partitionLabels.partitionLabels(s) ;
        System.out.println(result);
    }
}