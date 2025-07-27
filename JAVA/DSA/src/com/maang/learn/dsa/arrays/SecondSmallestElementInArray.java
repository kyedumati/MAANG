package com.maang.learn.dsa.arrays;

public class SecondSmallestElementInArray {
    static int secondSmallest(int arr[]) {
        int smallest = arr[0];
        int ssmallest = Integer.MAX_VALUE;

        for(int element: arr) {
            if(element<smallest) {
                ssmallest = smallest;
                smallest = element;

            } else if(element > smallest && element<ssmallest) {
                ssmallest = element;
            }
        }
        return ssmallest;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6};
        System.out.println(secondSmallest(arr));
        int arr2[] = {7,2,3,3,6};
        System.out.println(secondSmallest(arr2));

    }

}
