package com.maang.learn.dsa.sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    static void merge(int arr[], int low, int mid, int high) {
        int left = low;
        int right = mid+1;
        List<Integer> tempList = new ArrayList<>();
        while(left<=mid && right<=high) {
            if(arr[left]<= arr[right]) {
                tempList.add(arr[left]);
                left++;
            } else {
                tempList.add(arr[right]);
                right++;
            }
        }

        //add all remaining left array items to last if any
        while (left<=mid) {
            tempList.add(arr[left++]);
        }
        //add all remaining right array items to last if any
        while(right<=high){
            tempList.add(arr[right++]);
        }

        for(int i=low; i<=high; i++) {
            arr[i] = tempList.get(i-low);
        }

    }

    static void mergeSort(int arr[], int low, int high){
        if(low>=high) return;

        int mid = (low+high)/2;
        mergeSort(arr, low, mid); //deviding first part of array
        mergeSort(arr, mid+1, high); //deviding second part of array

        //merge the divided arrays
        merge(arr, low, mid, high);
    }


    public static void main(String[] args) {
        int inputArr[] = {13,46,24,52,9,8};
        System.out.println("Before merge:"+inputArr);
        for(int a: inputArr)
            System.out.print(a+ " ");
        mergeSort(inputArr, 0, inputArr.length-1);
        System.out.println("After merge:"+inputArr);
        for(int a: inputArr)
            System.out.print(a+ " ");
    }
}
