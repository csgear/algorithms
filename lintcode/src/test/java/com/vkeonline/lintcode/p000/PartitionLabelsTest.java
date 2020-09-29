package com.vkeonline.lintcode.p000;

import com.vkeonline.lintcode.p1000.PartitionLabels;
import org.junit.jupiter.api.Test;

import java.util.List;

class PartitionLabelsTest {

    @Test
    void testPartition() {
        PartitionLabels partitionLabels = new PartitionLabels() ;
        String s = "ababcbacadefegdehijhklij" ;
        List<Integer> result = partitionLabels.partitionLabels(s) ;
        System.out.println(result);
    }
}