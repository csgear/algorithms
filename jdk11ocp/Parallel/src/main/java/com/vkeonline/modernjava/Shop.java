package com.vkeonline.modernjava;

import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

import static java.util.stream.Collectors.toList;

public class Shop {
    private final static Random random = new Random();

    private final String shopName;

    public String getShopName() {
        return shopName;
    }

    public Shop(String shopName) {
        this.shopName = shopName;
    }

    public Future<Double> getPriceAsync(String product) {
//        CompletableFuture<Double> futurePrice = new CompletableFuture<>() ;
//
//        new Thread( () -> {
//            try {
//                double price = calculatePrice(product);
//                futurePrice.complete(price);
//            } catch (Exception e) {
//                futurePrice.completeExceptionally(e) ;
//            }
//
//        }).start();
//
//        return futurePrice ;

        // the code can be replaced with a simple factory method
        return CompletableFuture.supplyAsync(() -> calculatePrice(product));
    }



    public double getPrice(String product) {
        return calculatePrice(product);
    }

    private static void delay() {
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private double calculatePrice(String product) {
        delay();
        return random.nextDouble() * product.charAt(0) + product.charAt(1);
    }
}
