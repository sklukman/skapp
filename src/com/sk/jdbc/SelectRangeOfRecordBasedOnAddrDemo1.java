package com.sk.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectRangeOfRecordBasedOnAddrDemo1 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// String query = "select * from employee123 where esal";
		Class.forName(Driver.driver());
		Connection con = DriverManager.getConnection(DBInfo.Url(), DBInfo.User(), DBInfo.pwd());
		Statement st = con.createStatement();

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a city");
		String city = scn.next();
		String query = String.format("select * from employee123 where eaddr='%s'", city);
		ResultSet rs = st.executeQuery(query);
		boolean flag = false;
		System.out.println("Eno\tEName\tE\t\tESal");
		while (rs.next()) {
			flag = true;
			System.out
					.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t\t" + rs.getDouble(4));
		}
		if (flag == false) {
			System.out.println("Data not selected");
		}
		con.close();
	}
}
