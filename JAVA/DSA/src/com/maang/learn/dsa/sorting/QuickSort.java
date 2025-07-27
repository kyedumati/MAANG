package com.maang.learn.dsa.sorting;

public class QuickSort {

    static int findPartition(int arr[], int low, int high) {

        int pivot = arr[low]; //starting position
        int i = low;
        int j = high;
        while(i<j) {
            // move cursor from left and stop if we find element that is greater than pivot
            while(arr[i] <= pivot && i<= high-1) {
                i++;
            }
            // move cursor from right and stop if we find element that is less than pivot
            while(arr[j] > pivot && j>= low+1) {
                j--;
            }

            if(i<j) {
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // finally swap the low pivotor to its position and j becomes the new pivotor point
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }

    public static void quickSort(int arr[], int low, int high) {
        if(low<high) {
            int pivot = findPartition(arr, low, high);
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
        }
    }

    public static void main(String[] args){
        int inputArr[] = {13,46,24,52,9,8};
        System.out.print("Before merge:");
        for(int a: inputArr)
            System.out.print(a+ " ");
        quickSort(inputArr, 0, inputArr.length-1);
        System.out.print("After merge:");
        for(int a: inputArr)
            System.out.print(a+ " ");
    }
}
