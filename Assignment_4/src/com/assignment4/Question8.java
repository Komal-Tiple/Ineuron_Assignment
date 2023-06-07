package com.assignment4;

public class Question8 {

	 public static char getMaxOccurringChar(String str) {
	        // Assuming ASCII character set (256 possible characters)
	        int[] charCount = new int[256];

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            charCount[ch]++;
	        }

	        int maxCount = 0;
	        char maxChar = ' ';

	        for (int i = 0; i < charCount.length; i++) {
	            if (charCount[i] > maxCount) {
	                maxCount = charCount[i];
	                maxChar = (char) i;
	            }
	        }

	        return maxChar;
	    }

	 
	 public void display() {
		 String inputString = "Hello, World!";

	        char maxChar = getMaxOccurringChar(inputString);

	        System.out.println("The maximum occurring character is: " + maxChar);
	  
	 }
}
