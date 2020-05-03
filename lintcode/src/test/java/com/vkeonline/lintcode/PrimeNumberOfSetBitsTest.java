package com.vkeonline.lintcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberOfSetBitsTest {
    PrimeNumberOfSetBits primeNumberOfSetBits = new PrimeNumberOfSetBits() ;
    @Test
    void countPrimeSetBits() {
        System.out.println(primeNumberOfSetBits.countPrimeSetBits(10, 15));
    }
}