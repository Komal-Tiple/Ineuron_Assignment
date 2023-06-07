package com.assignment1;

public class Question2 {



public void question2() {
		int size = 7;

		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size * 2; j++) {
				if (j <= i || j > size * 2 - i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}




}
