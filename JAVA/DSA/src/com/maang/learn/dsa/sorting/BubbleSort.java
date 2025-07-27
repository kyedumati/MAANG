package com.maang.learn.dsa.sorting;

/**
 * Pushes the maximum to the last by adjacent swapping
 */
public class BubbleSort {

    public static int[] bubbleSort(int arr[]){
        int n=arr.length;
        for(int i=n-1;i>=0;i--) {
            for(int j=0;j<=i-1;j++) {
                if(arr[j+1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int inputArr[] = {13,46,24,52,9,8};
        int sortedArr[] = bubbleSort(inputArr);
        for(int val: sortedArr) {
            System.out.print(val+" ");
        }
    }
}
