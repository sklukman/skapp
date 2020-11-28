package com.sk.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTableValue1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String Driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String pwd = "manager";
		String query = "insert into employee123 values(5,'arbaj','aug',8000)";
		Class.forName(Driver);
		Connection conn = DriverManager.getConnection(url, user, pwd);
		Statement st = conn.createStatement();
		int updateCount = st.executeUpdate(query);
		System.out.println("A no of row inserted:" + updateCount);
		conn.close();
	}

}
