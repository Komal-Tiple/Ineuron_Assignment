package com.java.assessment.question3;

import java.util.Scanner;

public class Demo{

	public void demo() throws NegativeNumException {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        
		if(n>0) {
			System.out.println("Number is positive");
		}else {
			throw new NegativeNumException();
		}

	}

}
