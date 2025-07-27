package com.maang.learn.dsa.recursion;

public class SumNValues {

    static int sum = 0;

    /*
    Sum of N values functional way.
     */
    static int sumValuesFunctional(int n) {
        if (n==0)
            return 0;
        //sum+=n;
        return n + sumValuesFunctional(n-1);
    }

    /*
    Sum of N values from 1, using parameterised way
     */
    static void sumValuesParameterised(int i, int n) {
        if (i<1) {
            System.out.println(n);
            return;
        }
        sumValuesParameterised(i-1, i+n);
    }

    public static void main(String[] args){

        //Sum of values from 1 to 5
        sumValuesParameterised(5, 0);

        System.out.println(sumValuesFunctional(5));
    }
}
