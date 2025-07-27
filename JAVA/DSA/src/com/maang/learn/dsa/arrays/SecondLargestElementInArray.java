package com.maang.learn.dsa.arrays;

/**
 * Given an array of integers nums, return the second-largest element in the array. If the second-largest element does not exist, return -1.
 * Examples:
 * Input: nums = [8, 8, 7, 6, 5]
 * Output: 7
 * Explanation: The largest value in nums is 8, the second largest is 7
 *
 * Input: nums = [10, 10, 10, 10, 10]
 * Output: -1
 * Explanation: The only value in nums is 10, so there is no second largest value, thus -1 is returned
 */
public class SecondLargestElementInArray {

    static int secondLargestElement(int []arr) {
        /* Better solution
        int largest = arr[0];
        for(int element: arr) {
            if(element>largest) {
                largest = element;
            }
        }

        int slargest = -1;
        for(int element: arr) {
            if(element > slargest && element<largest) {
                slargest = element;
            }
        }
        return slargest;

         */
        //Optimal approach : *****
        int largest = arr[0];
        int slargest = -1;
        for(int element: arr) {
            if(element>largest) {
                slargest = largest;
                largest = element;
            } else if(element< largest && element>slargest) {
                slargest = element;
            }
        }
        return slargest;
    }

    public static void main(String[] args) {
        int arr[]= {8, 8, 7, 6, 5};
        System.out.println(secondLargestElement(arr));

        int arr2[]= {1, 10, 10, 10, 10};
        System.out.println(secondLargestElement(arr2));
    }
}
