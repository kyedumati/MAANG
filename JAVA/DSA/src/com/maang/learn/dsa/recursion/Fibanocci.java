package com.maang.learn.dsa.recursion;

public class Fibanocci {

    public static int fibanocci(int n) { //Nth fibonacci using recursion
        if(n<=1) return n;

        int last = fibanocci(n-1);
        int slast = fibanocci(n-2);
        return last + slast;
    }


    public static void main(String[] args) {
        System.out.println(fibanocci(6));
    }
}
