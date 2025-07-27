package com.maang.learn.dsa.recursion;

public class PalindromeString {

    static boolean reverseString(String str, int i) {
        int n = str.length();
        if(i>=n/2) return true;

        if(str.charAt(i) != str.charAt(n-1-i))
            return false;
        return reverseString(str, i+1);
    }

    public static void main(String[] args) {
        String str = "MADAM";
        boolean isPalindrome = reverseString(str, 0);
        if(isPalindrome) System.out.println(str + " is a palindrome");
        else System.out.println(str + " is not a palindrome");
        String str2 = "I love india";
        isPalindrome = reverseString(str2, 0);
        if(isPalindrome) System.out.println(str2 + " is a palindrome");
        else System.out.println(str2 + " is not a palindrome");

    }

}
