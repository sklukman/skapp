package com.sk.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertMultipleRowIntoTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String Driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String pwd = "manager";
		Connection con = DriverManager.getConnection(url, user, pwd);
		Statement st = con.createStatement();
		Class.forName(Driver);
		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.println("Enter Employee no.");
			int eno = scn.nextInt();
			System.out.println("Enter Employee name");
			String ename = scn.next();
			System.out.println("Enter Employee salary");
			double esal = scn.nextInt();
			System.out.println("Enter Employee addr.");
			String addr = scn.next();

			String query = String.format("insert into emp12 values(%d,'%s',%f,'%s')", eno, ename, esal, addr);
			int rowUpdated = st.executeUpdate(query);
			System.out.println("Record Inserted Successfully");
			System.out.println("Do you want insert one more Record   [yes or no]");
			String option = scn.next();
			if (option.equalsIgnoreCase("no")) {
				break;
			}
		}
	}
}
