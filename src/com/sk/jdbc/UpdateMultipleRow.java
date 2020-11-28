package com.sk.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateMultipleRow {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String pwd = "manager";
		Class.forName(Driver.driver());
		Connection conn = DriverManager.getConnection(url, user, pwd);
		Statement st = conn.createStatement();
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter emp bonus");
		double bonus = scn.nextDouble();
		System.out.println("Enter range of employee");
		double range = scn.nextDouble();
		String query = String.format("update employee123 set esal=esal+%f where esal<=%f", bonus, range);
		int rows = st.executeUpdate(query);
		System.out.println("Row updated" + rows);
		conn.close();
	}
}
