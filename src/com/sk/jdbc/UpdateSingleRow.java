package com.sk.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateSingleRow {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String pwd = "manager";
		String query = "update employee123 set esal=7000 where ename='lukman'";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, user, pwd);
		Statement st = con.createStatement();
		int r = st.executeUpdate(query);
		System.out.println("The no of row updated:" + r);
		con.close();
		}
}
