package com.sk.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BatchUpdate3 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName(Driver.driver());
		Connection con = DriverManager.getConnection(DBInfo.Url(), DBInfo.User(), DBInfo.pwd());
		Scanner scn = new Scanner(System.in);
		String query = String.format("insert into emp11 values(?,?,?,?)");
		PreparedStatement ps = con.prepareStatement(query);
		while (true) {
			System.out.println("Enter Eno");
			int eno = scn.nextInt();
			System.out.println("Enter Ename");
			String ename = scn.next();
			System.out.println("Enter Esal");
			double esal = scn.nextDouble();
			System.out.println("Enter Eaddr");
			String eaddr = scn.next();
			ps.setInt(1, eno);
			ps.setString(2, ename);
			ps.setDouble(3, esal);
			ps.setString(4, eaddr);
			ps.addBatch();
			System.out.println("Do you want insert one more record[yes/no]");
			String option = scn.next();
			if (option.equalsIgnoreCase("no")) {
				ps.executeBatch();
				break;
			}
			ps.executeBatch();
			System.out.println("Record inserted successfully");
			con.close();
		}
	}

}
