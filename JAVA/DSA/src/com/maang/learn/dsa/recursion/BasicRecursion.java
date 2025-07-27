package com.maang.learn.dsa.recursion;

public class BasicRecursion {

    /*
        Print Name N times using recursion.
     */
    public static void printName(int start, int n) {
        if (start > n)
            return;
        System.out.println("Name: Kasi");
        printName(start+1 , n);
    }

    static void printOneToN(int i, int n) {
        if (i>n) return;

        System.out.println(i);
        printOneToN(i+1, n);
    }

    static void printNToOne(int n) {
        if (n<=0) return;

        printNToOne(n-1);
        System.out.println(n);
    }

    static void printOneToNBackTrace(int i, int n) {
        if (i<1) return;

        printOneToNBackTrace(i-1, n);
        System.out.println(i);
    }

    static void printNToOneBackTrace(int i, int n) {
        if (i>=n)
            return;
        printNToOneBackTrace(i+1, n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        int n=10;
//        printName(1, n);
//        printOneToN(1, n);
//        printNToOne(n);
//        printOneToNBackTrace(5, 5);
        printNToOneBackTrace(1, n);
    }
}
