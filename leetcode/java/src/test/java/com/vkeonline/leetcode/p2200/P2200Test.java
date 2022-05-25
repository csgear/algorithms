package com.vkeonline.leetcode.p2200;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P2200Test {

    @Test
    void minimumHealth1() {
        MinimumHealthBeatGame minimumHealthBeatGame = new MinimumHealthBeatGame();
        int[] damage = {2, 5, 3, 4};
        int armor = 7;
        long expected = 10;
        assertEquals(expected, minimumHealthBeatGame.minimumHealth(damage, armor));
    }

    @Test
    void minimumHealth2() {
        MinimumHealthBeatGame minimumHealthBeatGame = new MinimumHealthBeatGame();
        int[] damage = {2, 7, 4, 3};
        int armor = 4;
        long expected = 13;
        assertEquals(expected, minimumHealthBeatGame.minimumHealth(damage, armor));
    }
}