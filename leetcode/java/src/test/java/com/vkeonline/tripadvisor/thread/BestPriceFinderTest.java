package com.vkeonline.tripadvisor.thread;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Supplier;

class BestPriceFinderTest {

    private static final BestPriceFinder bestPriceFinder = new BestPriceFinder();

    private static void execute(String msg, Supplier<List<String>> s) {
        long start = System.nanoTime();
        System.out.println(s.get());
        long duration = (System.nanoTime() - start) / 1_000_000;
        System.out.println(msg + " done in " + duration + " msecs");
    }

    @Test
    void findPricesSequential() {
        execute("sequential", () -> bestPriceFinder.findPricesSequential("myPhone27S"));
    }

    @Test
    void findPricesParallel() {
        execute("parallel", () -> bestPriceFinder.findPricesParallel("myPhone27S"));
    }

    @Test
    void findPricesFuture() {
        execute("composed CompletableFuture", () -> bestPriceFinder.findPricesFuture("myPhone27S"));
    }
}