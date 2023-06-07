package com.assignment4;

public class Question7 {

    public static boolean hasUniqueCharacters(String str) {
        // Assuming ASCII character set (256 possible characters)
        if (str.length() > 256) {
            return false;
        }

        boolean[] charSet = new boolean[256];

        for (int i = 0; i < str.length(); i++) {
            int charValue = str.charAt(i);

            if (charSet[charValue]) {
                return false;
            }

            charSet[charValue] = true;
        }

        return true;
    }
    
    
    public void display() {
    	 String inputString = "Hello, World!";

         if (hasUniqueCharacters(inputString)) {
             System.out.println("The string contains all unique characters.");
         } else {
             System.out.println("The string does not contain all unique characters.");
         }
    }
}
