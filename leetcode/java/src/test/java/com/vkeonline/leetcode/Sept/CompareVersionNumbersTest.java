package com.vkeonline.leetcode.Sept;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompareVersionNumbersTest {
    final static CompareVersionNumbers compareVersions = new CompareVersionNumbers() ;
    @Test
    void compareVersion() {
        String version1 = "1", version2 = "1.1" ;

        System.out.println(compareVersions.compareVersion(version1, version2) );
    }
}