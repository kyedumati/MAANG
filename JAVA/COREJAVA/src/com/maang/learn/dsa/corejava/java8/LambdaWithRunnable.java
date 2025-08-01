package com.maang.learn.dsa.corejava.java8;

public class LambdaWithRunnable {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("Runnable interface"));
        thread.run();
    }
}
