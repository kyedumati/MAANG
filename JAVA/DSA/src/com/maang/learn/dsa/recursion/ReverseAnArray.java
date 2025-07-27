package com.maang.learn.dsa.recursion;

public class ReverseAnArray {


    static void reverseArray(int[] arr, int l, int r) {
        if (l>=r)
            return;
        arr[l] = arr[l] + arr[r]; //l = 10 + 20
        arr[r] = arr[l] - arr[r]; //r = 30 - 20 = 10
        arr[l] = arr[l] - arr[r]; //l = 30 - 10 = 20
        reverseArray(arr, l+1, r-1);
    }

    static void reverseArrWithSingleVar(int[] arr, int l) {
        int n = arr.length;
        if (l>=n/2)
            return;
        arr[l] = arr[l] + arr[n-1-l]; //l = 10 + 20
        arr[n-1-l] = arr[l] - arr[n-1-l]; //r = 30 - 20 = 10
        arr[l] = arr[l] - arr[n-1-l]; //l = 30 - 10 = 20
        reverseArrWithSingleVar(arr, l+1);
    }
    

    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
       // reverseArray(arr, 0, arr.length-1);
        reverseArrWithSingleVar(arr, 0);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
