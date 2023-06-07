package com.jdbc.Operation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.jdbc.connection.JdbcConn;

public class CRUDOperations {
	public static boolean insert(CourseBean course) {
		boolean f = false;
		if (course.getTitle().isEmpty() == false && course.getDesc().isEmpty() == false) {
			try {

				JdbcConn cp = new JdbcConn();
				Connection con = cp.createConnection();

				String q = "insert into course(title, description) values(?,?)";

				PreparedStatement psmt = con.prepareStatement(q);

				psmt.setString(1, course.getTitle());
				psmt.setString(2, course.getDesc());

				psmt.executeUpdate();
				f = true;
			} catch (Exception e) {
				e.printStackTrace();
			}
			return f;
		}
		return f;

	}

	public static boolean delete(int courseId) {
		boolean f = false;

		try {
			JdbcConn cp = new JdbcConn();
			Connection con = cp.createConnection();

			// checking id is present in database table
			String query = "SELECT * FROM course where id='" + courseId + "' ";
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery(query);

			if (!resultSet.next()) {
				f = false;
			} else {
				String q = "delete from course where id=?";

				PreparedStatement psmt = con.prepareStatement(q);

				psmt.setInt(1, courseId);

				psmt.executeUpdate();
				f = true;
			}
			resultSet.close();
            statement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;

	}

	public static boolean update(CourseBean course) {

		boolean f = false;
		try {
			JdbcConn cp = new JdbcConn();
			Connection con = cp.createConnection();

			String q = "UPDATE course SET title = ?, description = ? WHERE id = ?";

			PreparedStatement psmt = con.prepareStatement(q);

			psmt.setString(1, course.getTitle());
			psmt.setString(2, course.getDesc());
			psmt.setInt(3, course.getId());

			psmt.executeUpdate();
			f = true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;

	}

	public static boolean display() {
		boolean f = false;
		try {
			JdbcConn cp = new JdbcConn();
			Connection con = cp.createConnection();
			
			Statement statement = con.createStatement();
			 String query = "SELECT * FROM course";
            // Execute the query and get the result set
            ResultSet resultSet = statement.executeQuery(query);

            if(!resultSet.next()) {
            	f=false;
            }else {
            	 while (resultSet.next()) {
                     int id = resultSet.getInt("id");
                     String descrip = resultSet.getString("description");
                     String title = resultSet.getString("title");

                     System.out.println("ID: " + id + ", Name: " + title + ", Description: " + descrip );
                     f=true;
                 }
            }
           

            // Close the resources
            resultSet.close();
            statement.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
}
