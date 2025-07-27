package com.maang.learn.dsa.arrays;

/*
Given an array of integers nums, return the value of the largest element in the array
Examples:
Input: nums = [3, 3, 6, 1]
Output: 6
Explanation: The largest element in array is 6
 */
public class LargestElementInArray {

    //Optimal
    static int largestElement(int []arr) {
        int largest = arr[0];
        for(int element: arr) {
            if(element> largest) {
                largest = element;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int arr[]= {3,3,6,1};
        System.out.println(largestElement(arr));
    }
}
