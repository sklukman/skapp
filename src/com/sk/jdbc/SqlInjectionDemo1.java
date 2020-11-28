package com.sk.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//to see sqlInjectionAttack we have enter user= durga'-- and pwd=java so we will get output as valid credentials .
public class SqlInjectionDemo1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName(Driver.driver());
		// String query="select count(*) from users1 where"
		Connection con = DriverManager.getConnection(DBInfo.Url(), DBInfo.User(), DBInfo.pwd());
		Statement st = con.createStatement();
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a user");
		String na = scn.next();
		System.out.println("Enter a pwd");
		String pw = scn.next();
		String query = "select count(*) from users where uname='" + na + "' and upwd='" + pw + "'";
		ResultSet rs = st.executeQuery(query);
		int c = 0;
		if (rs.next()) {
			c = rs.getInt(1);
			System.out.println("__________________________________" + c);
		}
		System.out.println("_________________" + c);
		if (c == 0) {
			System.out.println("invalid credentials");
		} else {
			System.out.println("valaid credentials");
		}
		con.close();
	}
}
