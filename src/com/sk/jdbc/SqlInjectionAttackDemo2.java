package com.sk.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SqlInjectionAttackDemo2 {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName(Driver.driver());
		Connection con = DriverManager.getConnection(DBInfo.Url(), DBInfo.User(), DBInfo.pwd());
		String query = "select count(*) from users where uname=? and upwd=?";
		PreparedStatement ps = con.prepareStatement(query);
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Name");
		String uname = scn.next();
		System.out.println("Enter a Pwd");
		String upwd = scn.next();
		ps.setString(1, uname);
		ps.setString(2, upwd);
		ResultSet rs = ps.executeQuery();
		int c = 0;
		if (rs.next()) {
			c = rs.getInt(1);
		}
		if (c == 0)
			System.out.println("Invalid Credentials");
		else
			System.out.println("valid Credentials");
		con.close();
	}
}
