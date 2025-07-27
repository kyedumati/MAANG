package com.maang.learn.dsa.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Hashing -> Prestoring and Fetching
 */
public class FindOccuranceInArray {

    static int hashArr[] = new int[21]; //Declaring array with whatever the maximum array problem states + 1

    /**
     * Precomputing the hash array
     */
    static int[] getIntHashArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            hashArr[arr[i]] += 1; // it will sum with existing value to 1, Note: default value of int is 0 so all zeros in array
        }
        return hashArr;
    }

    /**
     * Precomputing the character hash array
     */
    static int[] getCharHashArr(char ch[]) {
        int hashingArr[] = new int[256]; //all small and capital letters and symbols are 256
        for(int i=0; i<ch.length; i++) {
            hashingArr[ch[i]]++;
        }
        return hashingArr;
    }

    static Map<Character, Integer> getCharOccurance(char[] ch) {
        Map<Character, Integer> map = new HashMap<>();

        for(Character c: ch) {
            map.put(c, map.getOrDefault(c, 0));
        }
        return map;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* int queriesN = sc.nextInt();

        // Integer array
         int inputArr[] = {1,2,3,4,1,3,4,5,6,7,8,1};
        // preload hasharray
        int hashArr[] = getIntHashArr(inputArr);

        while(queriesN>0) {
            queriesN--;
            int searchVal = sc.nextInt();
            System.out.println(searchVal+": exists "+ hashArr[searchVal] + " times");
        }*/

        //Character array
     /*   char ch[] = "abccdd".toCharArray();
        System.out.println("Enter how many queries you want to execute:");
        int chHashArr[] = getCharHashArr(ch);
        queriesN = sc.nextInt();
        while(queriesN>0) {
            queriesN--;
            char searchCh = sc.next().charAt(0);
            System.out.println(searchCh+": exists "+ chHashArr[searchCh] + " times");
        }*/

        System.out.println("Enter String:");
        char chArr[] = sc.next().toCharArray();
        System.out.println("Enter character:");
        char ch = sc.next().charAt(0);

        Map<Character, Integer> map = getCharOccurance(chArr);
        

    }
}
