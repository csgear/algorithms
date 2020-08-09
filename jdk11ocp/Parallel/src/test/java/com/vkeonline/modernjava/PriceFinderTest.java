package com.vkeonline.modernjava;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class PriceFinderTest {
    private static long start, invocationTime, retrieveTime;
    PriceFinder priceFinder;

    @BeforeEach
    void setTimer() {
        priceFinder = new PriceFinder();
        start = System.nanoTime();
    }

    @AfterEach()
    void checkTimer() {
        retrieveTime = (System.nanoTime() - start) / 1_000_000L;
        System.out.println("Price returns after " + retrieveTime + " msecs");
    }

    @Test
    void findPrices() {

        List<String> prices = priceFinder.findPrices("iPhone12");
        long invocationTime = (System.nanoTime() - start) / 1_000_000L;
        System.out.println("Invocation returns after " + invocationTime + " msecs");

        try {
            System.out.println(String.valueOf(prices));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void findPricesParallel() {
        List<String> prices = priceFinder.findPricesParallel("iPhone12");

        long invocationTime = (System.nanoTime() - start) / 1_000_000L;
        System.out.println("Invocation returns after " + invocationTime + " msecs");

        try {
            System.out.println(String.valueOf(prices));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}