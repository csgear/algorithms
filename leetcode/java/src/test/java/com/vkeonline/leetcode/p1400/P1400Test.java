package com.vkeonline.leetcode.p1400;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P1400Test {

    @Test
    void testPaintHouse3() {
        PaintHouse3 paintHouse3 = new PaintHouse3() ;
        int[] houses = {0,2,1,2,0} ;
        int[][] cost = {{1,10},{10,1},{10,1},{1,10},{5,1}} ;
        int m = 5, n = 2, target = 3 ;
        int expected = 11 ;
        assertEquals(expected, paintHouse3.minCost(
                houses, cost, m, n, target
        ));
    }

    @Test
    void stringShift() {
        StringShifts ss = new StringShifts() ;
        String s = "abc" ;
        int[][] shift = {{0,1}, {1,2}} ;
        assertEquals("cab", ss.stringShift(s, shift) ) ;
    }

    @Test
    void showFirstUnique() {
        int[] nums = {7,7,7,7,7,7} ;
        FirstUnique firstUnique = new FirstUnique(nums) ;
        assertEquals(-1, firstUnique.showFirstUnique()) ;
    }
    @Test
    void countElements() {
        CountingElements ce = new CountingElements() ;
        int result  ;
        result = ce.countElements(new int[]{1,1,3,3,5,5,7,7});
        assertEquals(0, result);
        result = ce.countElements(new int[]{1,3,2,3,5,0}) ;
        assertEquals(3, result);
    }

    @Test
    void testMinReorder() {
        ReorderRoutes reorderRoutes = new ReorderRoutes() ;
        int n = 5 ;
        int[][] connections = {{1,0},{1,2},{3,2},{3,4}} ;
        int expected =2 ;
        assertEquals(expected, reorderRoutes.minReorder(n, connections));
    }

    @Test
    void minJumps() {
        JumpGame4 jumpGame4 = new JumpGame4() ;

        int[] array = {100,-23,-23,404,100,23,23,23,3,404} ;
        int expected = 3 ;

        assertEquals(expected, jumpGame4.minJumps(array));
    }

    @Test
    void minRemoveToMakeValid() {
        String s = "lee(t(c)o)de)";
        String expected = "lee(t(c)o)de";
        MinimumRemove minimumRemove = new MinimumRemove();
        assertEquals(expected, minimumRemove.minRemoveToMakeValid(s));
    }

    @Test
    void maxScore() {
        MaximumPoints maximumPoints = new MaximumPoints();
        int[] cardPoints = {1, 2, 3, 4, 5, 6, 1};
        int k = 3;
        int expected = 12;
        assertEquals(expected, maximumPoints.maxScore(cardPoints, k));
    }
}