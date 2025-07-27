package com.maang.learn.dsa.arrays;

public class RemoveDuplicatesInSortedArray {

    /* returns unique array count*/
    static int removeDuplicates(int arr[]) {
        int i = 0;  //holding first element, considering this is unique: it is a sorted array
        for (int j = 1; j < arr.length; j++) { //starting  from 1 index because index 0 we treat as unique already
            if (arr[i] != arr[j]) { //if the element is not same, treat it unique and add it into arrays next position i+1
                arr[i + 1] = arr[j];
                i++; //moving the cursor to next element once new unique is identified
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,2,3,4,4,5,5,6,6,7,7,7,8,9};
        System.out.println(removeDuplicates(arr));
    }

}
