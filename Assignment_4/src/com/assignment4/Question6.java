package com.assignment4;

public class Question6 {

	public static boolean isPangram(String str) {
		// Remove spaces and convert to lowercase
		str = str.replaceAll("\\s", "").toLowerCase();

		// Create a boolean array to mark the presence of each letter
		boolean[] letters = new boolean[26];

		// Iterate through each character in the string
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			// Check if the character is a letter
			if (ch >= 'a' && ch <= 'z') {
				// Mark the corresponding index in the boolean array as true
				letters[ch - 'a'] = true;
			}
		}

		// Check if any letter is missing
		for (boolean letter : letters) {
			if (!letter) {
				return false;
			}
		}

		return true;
	}

	public void display() {
		String inputString = "The quick brown fox jumps over the lazy dog";

		if (isPangram(inputString)) {
			System.out.println("The string is a pangram.");
		} else {
			System.out.println("The string is not a pangram.");
		}
	}
}
