package com.maang.learn.dsa.recursion;

public class FactRecursion {

    static int f = 1;
    static int factorial(int n) {
        if(n<=1)
            return 1;
//        f+=f*(n-1)
//         System.out.println(n);

        return n*(factorial(n-1));
//        System.out.println(f);

    }

    public static void main(String[] args) {
//       factorial(5);
       System.out.println(factorial(5));
    }
}
