package com.assignment4;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Question1 {

	public void removeDuplicates() {

		String str = "Hello World!!";
		// Create a LinkedHashSet to maintain the order of characters
		LinkedHashSet<Character> uniqueChars = new LinkedHashSet<>();

		// Iterate through the string and add each character to the LinkedHashSet
		for (char c : str.toCharArray()) {
			uniqueChars.add(c);
		}

		// Construct the resulting string by joining the unique characters
		StringBuilder result = new StringBuilder();
		for (char c : uniqueChars) {
			result.append(c);
		}
		System.out.println("without duplicate element: " + result);
	}
}
