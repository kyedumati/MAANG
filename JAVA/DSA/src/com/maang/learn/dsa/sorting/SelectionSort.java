package com.maang.learn.dsa.sorting;

/**
 * Select the minimum and swap is the selection sorting
 */
public class SelectionSort {

    public static int[] sortArray(int arr[]) {
        for(int i=0; i<=arr.length-2; i++) {
            int min=i;
            for(int j=i;j<=arr.length-1;j++) {
                if(arr[j]<arr[min]) {
                    min = j;
                }
            }

            //swap once min found
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int inputArr[] = {13,46,24,52,9,8};
        int sortedArr[] = sortArray(inputArr);
        for(int val: sortedArr) {
            System.out.print(val+" ");
        }
    }
}
