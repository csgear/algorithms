package com.vkeonline.leetcode.p800;

import java.util.List;

import com.vkeonline.leetcode.utils.Utils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author csgear
 */
class P800Test {

    @Test
    void shortestToChar() {
        ShortestDistanceChar shortestDistanceChar = new ShortestDistanceChar() ;
        String s = "loveleetcode" ;
        char c = 'e' ;
        int[] expected = {3,2,1,0,1,0,0,1,2,2,1,0} ;
        assertArrayEquals(expected, shortestDistanceChar.shortestToChar(s, c)) ;

    }
    @Test
    void testCanVisitAllRooms() {
        KeysRooms keysRooms = new KeysRooms() ;
        int[][] rooms = {{1,3},{3,0,1},{2},{0}} ;
        boolean expected = false ;
        assertEquals(expected, keysRooms.canVisitAllRooms(
                Utils.twoDimArrayToList(rooms)));

    }

    @Test
    void testEventualSafeNodes() {
        FindEventualSafeStates findEventualSafeStates = new FindEventualSafeStates() ;
        int[][] graph = {{1,2},{2,3},{5},{0},{5},{},{}} ;
        List<Integer> expected = List.of(2,4,5,6) ;
        assertEquals(expected, findEventualSafeStates.eventualSafeNodes(graph));
    }

    @Test
    void expressiveWords() {
        String s = "zzzzzyyyyy" ;
        String[] words = {"zzyy","zy","zyy"} ;
        int expected = 3 ;
        ExpressiveWord expressiveWord = new ExpressiveWord() ;
        assertEquals(expected, expressiveWord.expressiveWords(s, words));
    }

    @Test
    void mirrorReflection() {
        MirrorReflection mirrorReflection = new MirrorReflection() ;
        int p = 2 ;
        int q = 1 ;
        int expected = 2 ;
        assertEquals(expected, mirrorReflection.mirrorReflection(p, q));
    }

    @Test
    void numFactoredBinaryTrees() {
        BinaryTreesWithFactors binaryTreesWithFactors = new BinaryTreesWithFactors() ;
        int[] arr = {2,4,5,10} ;
        int expected = 7 ;

        assertEquals(expected, binaryTreesWithFactors.numFactoredBinaryTrees(arr));
    }
}