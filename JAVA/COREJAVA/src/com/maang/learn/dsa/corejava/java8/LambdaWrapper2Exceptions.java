package com.maang.learn.dsa.corejava.java8;

import java.util.function.BiConsumer;

public class LambdaWrapper2Exceptions {

    static void processNums(int[] numbers, int key, BiConsumer<Integer, Integer> consumer) {
        for(int i: numbers) {
//            System.out.println(i+key);
            consumer.accept(i, key);
        }
    }

    private static BiConsumer<Integer, Integer> wrapperLamda(BiConsumer<Integer, Integer> biConsumer) {
        return (v, k) -> {
            try {
                biConsumer.accept(v, k);
            }catch(ArithmeticException ae) {
                System.out.println("Exception caught in wrapper lamda");
            }
        };
    }

    public static void main(String[] args){
        int []someNumbers = {1,2,3,4};
        int key = 0;
        processNums(someNumbers, key, (v, k) -> System.out.println(v+k)); //dynamic operation
        processNums(someNumbers, key, wrapperLamda((v, k) -> System.out.println(v/k))); //dynamic operation
    }
}
