package com.vkeonline.modernjava;

public class ThreadTutorial {
    public static void main(String[] args) {
        Thread thread = new Thread(new Task()) ;
        thread.start();
        System.out.println("Thread Name: " + Thread.currentThread().getName());
    }
    static class Task implements Runnable {
        @Override
        public void run() {
            System.out.println("Thread Name: " + Thread.currentThread().getName());
        }
    }
}
