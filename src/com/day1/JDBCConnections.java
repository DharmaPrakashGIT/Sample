package com.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCConnections {
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// connct to database
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Ihost:1521:xe", "hr", "admin");

			// Write SQL Query
			String sql = "select * from employees";

			// prepare statement
			PreparedStatement statement = con.prepareStatement(sql);
			ResultSet executeQuery = statement.executeQuery();

			while (executeQuery.next()) {

				String fName = executeQuery.getString("first_name");
				String lName = executeQuery.getString("last_name");
				System.out.println(fName);
				System.out.println(lName);
			}

			con.close();

		} catch (ClassNotFoundException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
