package com.vkeonline.lintcode.p1200;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HeatersTest {
    Heaters heatersObj = new Heaters();

    @Test
    void findRadius() {
        int[] houses = {1, 2, 3, 4};
        int[] heaters = {1, 4};
        int expected = 1;
        assertEquals(expected, heatersObj.findRadius(houses, heaters));
    }
}