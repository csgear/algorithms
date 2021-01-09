package com.vkeonline.leetcode.year2020.sept;

import org.junit.jupiter.api.Test;

class CompareVersionNumbersTest {
    final static CompareVersionNumbers compareVersions = new CompareVersionNumbers() ;
    @Test
    void compareVersion() {
        String version1 = "1", version2 = "1.1" ;

        System.out.println(compareVersions.compareVersion(version1, version2) );
    }
}