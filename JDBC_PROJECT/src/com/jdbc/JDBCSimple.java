package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCSimple {

	public static void main(String[] args) {
		
		try {
			
		Class.forName("com.mysql.jdbc.cj.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/learn","root","root");
			/*Statement stmt = con.createStatement();
			ResultSet re= stmt.executeQuery("select * from student");
			while (re.next()) {
				System.out
						.println(re.getInt(1) + " " + re.getString(2) + " " + re.getString(3) + " " + re.getString(4));
				con.close();
				System.out.println("create project Start......");
*/
			
			if (con.isClosed()) {
				System.out.println("Connection is close");
			}
			else {
				System.out.println("Connection is created");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
