package com.assignment1;

public class Question1 {

	public void question1() {
		int size = 10;

		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size; j++) {
				if (i == 1 || i == size || j == 1 || j == size) {
					System.out.print("*");
				} else if (i <= size / 2 && j == size / 2 + 1 - i) {
					System.out.print("*");
				} else if (i <= size / 2 && j == size / 2 + i) {
					System.out.print("*");
				} else if (i > size / 2 && j == i - size / 2) {
					System.out.print("*");
				} else if (i > size / 2 && j == size - i + size / 2) {
					System.out.print("*");
				} else if (i == size / 2 + 1 && j > size / 2 && j <= size - size / 2) {
					System.out.print(" ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}
