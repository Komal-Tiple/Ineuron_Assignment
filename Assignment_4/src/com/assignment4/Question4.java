package com.assignment4;

public class Question4 {

	public static void countCharacters(String str) {
        int vowelsCount = 0;
        int consonantsCount = 0;
        int specialCharsCount = 0;

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelsCount++;
                } else {
                    consonantsCount++;
                }
            } else {
                specialCharsCount++;
            }
        }

        System.out.println("Number of vowels: " + vowelsCount);
        System.out.println("Number of consonants: " + consonantsCount);
        System.out.println("Number of special characters: " + specialCharsCount);
    }

	public void display() {
		 String inputString = "Hello, World!";
	        countCharacters(inputString);
	}
}
