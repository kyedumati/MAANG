package com.maang.learn.dsa.sorting;

/**
 * Take an element and place it into its position,
 * and keep swap to left till its goes to its position
 */
public class InsertionSort {

    public static int[] insertionSortArr(int arr[]) {
        for(int i=0; i<=arr.length-1; i++) {
            int j=i;
            while(j>0 && arr[j-1]>arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int inputArr[] = {13,46,24,52,9,8};
        int sortedArr[] = insertionSortArr(inputArr);
        for(int val: sortedArr) {
            System.out.print(val+" ");
        }
    }
}
