package com.vkeonline.leetcode.year2021.feb;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimplifyPathTest {

    @Test
    void simplifyPath() {
        String path = "/a/./b/../../c/" ;
        String expected = "/c" ;

        SimplifyPath simplifyPath = new SimplifyPath() ;
        assertEquals(expected, simplifyPath.simplifyPath(path));
    }

    @Test
    void simplifyPathWithDoubleSlash() {

        String path = "/home//foo/" ;
        String expected =  "/home/foo" ;

        SimplifyPath simplifyPath = new SimplifyPath() ;
        assertEquals(expected, simplifyPath.simplifyPath(path));
    }
}