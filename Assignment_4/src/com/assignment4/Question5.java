package com.assignment4;

public class Question5 {

	public static boolean areAnagrams(String str1, String str2) {
		// Remove spaces and convert to lowercase
		str1 = str1.replaceAll("\\s", "").toLowerCase();
		str2 = str2.replaceAll("\\s", "").toLowerCase();

		// Check lengths of both strings
		if (str1.length() != str2.length()) {
			return false;
		}

		// Count the occurrences of each character in str1
		int[] charCount = new int[26];

		for (int i = 0; i < str1.length(); i++) {
			charCount[str1.charAt(i) - 'a']++;
		}

		// Decrement the count for each character in str2
		for (int i = 0; i < str2.length(); i++) {
			charCount[str2.charAt(i) - 'a']--;
		}

		// Check if any character count is non-zero
		for (int i = 0; i < 26; i++) {
			if (charCount[i] != 0) {
				return false;
			}
		}

		return true;
	}

	public void display() {
		String str1 = "listen";
		String str2 = "silent";

		if (areAnagrams(str1, str2)) {
			System.out.println("The strings are anagrams.");
		} else {
			System.out.println("The strings are not anagrams.");
		}
	}
}
