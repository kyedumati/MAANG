package com.maang.learn.dsa.hashing;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given an array of n integers, find the most frequent element in it i.e., the element that occurs the
 * maximum number of times.
 * If there are multiple elements that appear a maximum number of times, find the smallest of them.
 *
 * Ex:
 * Input: arr = [1, 2, 2, 3, 3, 3]
 * Output: 3
 * Explanation: The number 3 appears the most (3 times). It is the most frequent element.
 */
public class HighestOccuranceElementInArray {

    public static int mostFrequentElement(int []nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n:nums) {
            map.put(n, map.getOrDefault(n, 0)+1);
        }

        int occurance = 0;
        int resultVal = 0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (entry.getValue() > occurance) {
               occurance = entry.getValue();
               resultVal = entry.getKey();
            }
        }
        return resultVal;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,2,2,3,3,4,4,5};
        int num = mostFrequentElement(nums);
        System.out.println(num);
    }
}
