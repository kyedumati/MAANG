package com.maang.learn.dsa.corejava.java8;

@FunctionalInterface
interface A {
    int sum(int a, int b);
}

//Type inference
interface Greeting {
    void greet(String message);
}

public class LambdaExpressions {

    public static void greetWithMessage(Greeting greeting) {
       greeting.greet("Hello world");
    }

    public static void main(String[] args) {
        A obj = (a, b) -> a+b;
        System.out.println(obj.sum(6,5));
        // infer type
        greetWithMessage((message -> System.out.println(message)));
    }

}
