package com.vkeonline.lintcode.p000;

import org.junit.jupiter.api.Test;

class PrimeNumberOfSetBitsTest {
    PrimeNumberOfSetBits primeNumberOfSetBits = new PrimeNumberOfSetBits() ;
    @Test
    void countPrimeSetBits() {
        System.out.println(primeNumberOfSetBits.countPrimeSetBits(10, 15));
    }
}