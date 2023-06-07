package com.assignment1;

public class Question3 {

	public void question3() {
		int size = 11;

		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= (size - i + 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 2; i <= size; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
