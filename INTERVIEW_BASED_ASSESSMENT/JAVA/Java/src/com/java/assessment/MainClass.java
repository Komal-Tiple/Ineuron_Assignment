package com.java.assessment;

import java.util.Scanner;

import com.java.assessment.jdbc.Jdbc;
import com.java.assessment.question1.ShapImpl;
import com.java.assessment.question10.SecondLargestSmallest;
import com.java.assessment.question2.Child;
import com.java.assessment.question3.Demo;
import com.java.assessment.question3.NegativeNumException;
import com.java.assessment.question4.BankServer;
import com.java.assessment.question5.Bike;
import com.java.assessment.question5.Honda;
import com.java.assessment.question6.StreamApi;
import com.java.assessment.question7.BinarySearch;
import com.java.assessment.question8.TheadExample;
import com.java.assessment.question9.ProducerConsumer;

public class MainClass {

	public static void main(String[] args) throws NegativeNumException {

		// Question 1
		ShapImpl shapImpl = new ShapImpl();
		shapImpl.circle(5);
		shapImpl.triangle(1, 2, 3);

		// Question 2
		Child child = new Child();

		// Question 4
		BankServer bnk = new BankServer();
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter username");
		String userName = myObj.nextLine();
		System.out.println("Enter digits for withdrawn");
		Integer withdrawn = Integer.parseInt(myObj.nextLine());
		bnk.withdrawn(userName, withdrawn);

		System.out.println("Enter username");
		String userName1 = myObj.nextLine();
		System.out.println("Enter digits for Deposit");
		Integer deposit = Integer.parseInt(myObj.nextLine());
		bnk.deposit(userName1, deposit);

		// Question 5
		Bike obj = new Honda();
		obj.run();
		obj.changeGear();

		// Question 6
		StreamApi str = new StreamApi();
		str.StreamApiOperation();

		// Question 7
		BinarySearch binary = new BinarySearch();
		binary.BinarySearchExample();

		// Question 8
		TheadExample thread = new TheadExample();
		thread.EvenOdd();

		// Questio 10
		SecondLargestSmallest sl = new SecondLargestSmallest();
		sl.secondLarsmall();

		// Question 9
		//ProducerConsumer procon = new ProducerConsumer();
		//procon.ProdCon();

		// Question 3
		//Demo demo = new Demo();
		//demo.demo();

		Jdbc jdbc = new Jdbc();
		jdbc.DatabaseReader();
	}

}
