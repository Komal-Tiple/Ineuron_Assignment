package com.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc.Operation.CRUDOperations;
import com.jdbc.Operation.CourseBean;

public class Start {

	static Connection connection;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("Press 1 to add course");
			System.out.println("Press 2 to delete course");
			System.out.println("Press 3 to display course");
			System.out.println("Press 4 to update course");
			System.out.println("Press 5 to exit..");
			int c = Integer.parseInt(br.readLine());

			if (c == 1) {
				// add course
				System.out.println("Enter course name");
				String title = br.readLine();
				System.out.println("Enter course description");
				String desc = br.readLine();
				CourseBean course = new CourseBean(title, desc);
				boolean ans = CRUDOperations.insert(course);
				if(ans==true) {
					System.out.println("course added successfully");
				}else {
					System.out.println("something went wrong");
				}
			} else if (c == 2) {
				// delete course
				System.out.println("Enter Course id to delete");
				int courseId = Integer.parseInt(br.readLine());
				boolean ans = CRUDOperations.delete(courseId);
				if(ans==true) {
					System.out.println("course deleted successfully");
				}else {
					System.out.println("something went wrong");
				}
					
			} else if (c == 3) {
				// display course
				boolean ans = CRUDOperations.display();
			} else if (c == 4) {
				// update course
				System.out.println("Enter course id");
				int id = Integer.parseInt(br.readLine());
				System.out.println("Enter course name");
				String title = br.readLine();
				System.out.println("Enter course description");
				String desc = br.readLine();
				CourseBean course = new CourseBean(id, title, desc);
				boolean ans = CRUDOperations.update(course);
				System.out.println(ans);
				if(ans==true) {
					System.out.println("course update successfully");
				}else {
					System.out.println("please enter correct course id else something went wrong");
				}
			} else {

			}

		}
	}

}
