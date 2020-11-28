package com.sk.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String pwd = "manager";
		String query = "create table employee123(eno number(10),ename varchar2(20),eaddr varchar2(20),esal number(20))";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, user, pwd);
		Statement st = con.createStatement();
		 st.executeUpdate(query);
			System.out.println("Table created");
		
	}
}
