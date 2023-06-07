package com.assignment4;

public class Question3 {

	public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
	


public void display() {
	String inputString = "2552";
    boolean isPalindrome = isPalindrome(inputString);

    if (isPalindrome) {
        System.out.println("The string is a palindrome.");
    } else {
        System.out.println("The string is not a palindrome.");
    }
}
}