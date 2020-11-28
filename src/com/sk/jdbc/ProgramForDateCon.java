package com.sk.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ProgramForDateCon {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, ParseException {

		Class.forName(Driver.driver());
		Connection con = DriverManager.getConnection(DBInfo.Url(), DBInfo.User(), DBInfo.pwd());
		String query = "insert into userid values(?,?)";
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter user name");
		String uname = scn.next();
		// Enter date 30-01-98
		System.out.println("ENTER DOB (dd-MM-yyyy) format");
		String dob = scn.next();
		SimpleDateFormat sd = new SimpleDateFormat("dd-mm-yyyy");
		java.util.Date ud = sd.parse(dob);
		long i = ud.getTime();
		java.sql.Date d = new java.sql.Date(i);
		PreparedStatement pst = con.prepareStatement(query);
		pst.setString(1, uname);
		pst.setDate(2, d);
		int rc = pst.executeUpdate();
		if (rc == 0) {
			System.out.println("Date is not inserted");
		} else
			System.out.println("Date is inserted");
		con.close();
	}
}
