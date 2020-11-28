package com.sk.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class JdbcRowSetInsert {

	/*
	 * String driver = "com.mysql.jdbc.Driver"; String url =
	 * "jdbc:mysql://localhost:3306/sksoft"; String user = "root"; String pwd =
	 * "root"; String query = "select * from skemp"; Class.forName(driver);
	 */
	/*
	 * Class.forName(Driver.driver()); Scanner scn = new Scanner(System.in);
	 * RowSetFactory rsf = RowSetProvider.newFactory(); JdbcRowSet rs =
	 * rsf.createJdbcRowSet(); rs.setUrl(DBInfo.Url());
	 * rs.setUsername(DBInfo.User()); rs.setPassword(DBInfo.pwd());
	 * rs.setCommand("select * from emp12"); rs.execute(); rs.moveToInsertRow();
	 * while (true) { System.out.println("Enter eno"); int eno = scn.nextInt();
	 * System.out.println("Enter a name"); String ename = scn.next();
	 * System.out.println("Enter a sal"); double esal = scn.nextDouble();
	 * System.out.println("Enter a eaddr"); String eaddr = scn.next();
	 * rs.updateInt(1, eno); rs.updateString(2, ename); rs.updateDouble(3, esal);
	 * rs.updateString(4, eaddr); rs.insertRow();
	 * System.out.println("Recored inserted successfully");
	 * System.out.println("Do you want insert one more record [yes/no]"); String
	 * option = scn.next(); if (option.equalsIgnoreCase("no")) { break; } }
	 * rs.close(); }
	 * 
	 * }
	 */
	public static void main(String[] args) throws Exception {

		Class.forName(Driver.driver());
		Scanner scn = new Scanner(System.in);
		RowSetFactory rsf = RowSetProvider.newFactory();
		JdbcRowSet rs = rsf.createJdbcRowSet();
		rs.setUrl(DBInfo.Url());
		rs.setUsername(DBInfo.User());
		rs.setPassword(DBInfo.pwd());
		rs.setCommand("select * from emp12");
		rs.execute();
		Scanner s = new Scanner(System.in);
		rs.moveToInsertRow();
		while (true) {
			System.out.print("Employee Number    :");
			int eno = s.nextInt();
			System.out.print("Employee Name      :");
			String ename = s.next();
			System.out.print("Employee Salary    :");
			float esal = s.nextFloat();
			System.out.print("Employee Address   :");
			String eaddr = s.next();

			rs.updateInt(1, eno);
			rs.updateString(2, ename);
			rs.updateFloat(3, esal);
			rs.updateString(4, eaddr);
			rs.insertRow();

			System.out.println("Employee Record Inserted Successfully");
			System.out.print("Do You Want to insert One more Employee[yes/no]?  :");
			String option = s.next();
			if (option.equalsIgnoreCase("No")) {
				break;
			}
		}
		rs.close();
	}
}