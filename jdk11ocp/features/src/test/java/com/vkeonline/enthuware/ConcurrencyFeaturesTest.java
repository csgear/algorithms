package com.vkeonline.enthuware;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.junit.jupiter.api.Assertions.*;

class ConcurrencyFeaturesTest {

    @Test
    public void firstExecutorService() {
        Runnable hellos = () -> {
            for(int i = 0 ; i < 1000 ; i++) {
                System.out.println("Hello " + i );
            }
        } ;

        Runnable goodbyes = () -> {
            for(int i = 0 ; i < 1000 ; i++) {
                System.out.println("Goodbye " + i);
            }
        } ;

        ExecutorService executor = Executors.newCachedThreadPool() ;
        executor.execute(hellos);
        executor.execute(goodbyes);
    }


}