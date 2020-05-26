package com.vkeonline.modernjava;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Future;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {

    @Test
    void getPriceAsync() {
        Shop shop = new Shop("Bestshop") ;
        long start = System.nanoTime() ;
        Future<Double> futurePrice = shop.getPriceAsync("my product") ;
        long invocationTime = (System.nanoTime() - start) / 1_000_000L ;
        System.out.println("Invocation returns after " + invocationTime + " msecs");

        try {
            double price = futurePrice.get() ;
            System.out.printf("Price is %.2f\n", price);
        } catch (Exception e) {
            throw new RuntimeException(e) ;
        }

        long retrieveTime = (System.nanoTime() - start) / 1_000_000L ;

        System.out.println("Price returns after " + retrieveTime + " msecs");
    }

    @Test
    void getPrice() {

    }


}