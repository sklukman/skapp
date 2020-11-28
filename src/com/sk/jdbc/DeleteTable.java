package com.sk.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
String Driver="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String pwd="manager";
		String query="drop table emp1";
		Class.forName(Driver);
		Connection conn=DriverManager.getConnection(url,user,pwd);
		Statement st=conn.createStatement();
		st.executeUpdate(query);
		System.out.println("table deleted successfully");
		conn.close();
		
	}

}
