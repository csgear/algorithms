package com.vkeonline.uwaterloo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiaojun.yang
 */
class MathSolTest {

    private  MathSol mathSol = new MathSol() ;
    @Test
    void numberOfWords() {
        int expected = 19240 ;
        assertEquals(expected, mathSol.numberOfWords(7));
    }

    @Test
    void winningStrategy() {
        int expected = 33 ;
        assertEquals(expected, mathSol.winningStrategy(50));
    }
}