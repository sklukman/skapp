package com.sk.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class PreparedStatementInsertDataIntoTable {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(Driver.driver());
		Connection con = DriverManager.getConnection(DBInfo.Url(), DBInfo.User(), DBInfo.pwd());
		String query = "insert into employee123 values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(query);
		while (true) {
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter sno");
			int eno = scn.nextInt();
			System.out.println("Enter ename");
			String ename = scn.next();
			System.out.println("Enter eaddr");
			String eaddr = scn.next();
			System.out.println("Enter esal");
			double sal = scn.nextInt();
			ps.setInt(1, eno);
			ps.setString(2, ename);
			ps.setString(3, eaddr);
			ps.setDouble(4, sal);
			ps.executeUpdate();
			System.out.println("Record inserted successfully");
			System.out.println("Do you want to insert one more record [yes/no]");
			String option = scn.next();
			if (option.equalsIgnoreCase("no")) {
				break;
			}
		}
		con.close();
	}
}
