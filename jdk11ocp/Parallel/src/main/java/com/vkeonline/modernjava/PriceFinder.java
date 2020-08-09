package com.vkeonline.modernjava;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import static java.util.stream.Collectors.toList;

public class PriceFinder {
    private final List<Shop> shops =  List.of(new Shop("BestPrice"),
            new Shop("LastSaveBig"),
            new Shop("Amazon"),
            new Shop("Alibaba"));

    public List<String> findPrices(String product) {
        return shops.stream().map(shop -> String.format("%s price is %.2f", shop.getShopName(),
                shop.getPrice(product))).collect(toList()) ;
    }

    public List<String> findPricesParallel(String product) {
        return shops.stream().parallel().map(shop -> String.format("%s price is %.2f", shop.getShopName(),
                shop.getPrice(product))).collect(toList()) ;
    }

    public List<CompletableFuture<String>> findPricesAsync(String product) {
        return shops.stream().map(shop -> CompletableFuture.supplyAsync(() -> {
            return String.format("%s price is %.2f", shop.getShopName(),
                    shop.getPrice(product)) ;
        })).collect(toList()) ;
    }
 }
