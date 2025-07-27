package com.maang.learn.dsa.hashing;

import java.util.*;

/**
 * Given an array nums of size n which may contain duplicate elements, return a list of pairs where each
 * pair contains a unique element from the array and its frequency in the array.
 * You may return the result in any order, but each element must appear exactly once in the output.
 *
 * Ex: Input: nums = [1, 2, 2, 1, 3]
 * Output: [[1, 2], [2, 2], [3, 1]]
 * Explanation:
 * - 1 appears 2 times
 * - 2 appears 2 times
 * - 3 appears 1 time
 * Order of output can vary.
 */
public class CountingFreqArray {

    public static List<List<Integer>> countFrequencies(int[] nums) {
        List<List<Integer>> freqList = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums) {
            map.put(n, map.getOrDefault(n, 0)+1);
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            freqList.add(Arrays.asList(entry.getKey(), entry.getValue()));
        }

        return freqList;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,3,4,5};
        List<List<Integer>> freqList = countFrequencies(nums);
        System.out.println(freqList);
    }

}
