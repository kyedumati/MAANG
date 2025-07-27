package com.maang.learn.dsa.arrays;

public class CheckIfArrayIsSorted {

    static boolean isArraySorted(int arr[]) {
        boolean isSorted = true;
        for(int i=1;i<=arr.length-1;i++) {
            if(arr[i]>arr[i-1]){
                continue;
            } else {
                isSorted = false;
                break;
            }
        }
        return isSorted;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.println(isArraySorted(arr));
        int arr1[] = {1,2,4,3};
        System.out.println(isArraySorted(arr1));
    }
}
