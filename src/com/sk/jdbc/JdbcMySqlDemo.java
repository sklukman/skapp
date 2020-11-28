package com.sk.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcMySqlDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/sksoft";
		String user = "root";
		String pwd = "root";
		String query = "select * from skemp";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, user, pwd);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		boolean flag = false;
		System.out.println("Eno\tEName\tESal\t\tEAddr");
		while (rs.next()) {
			flag = true;
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getDouble(3) + "\t\t" + rs.getString(4));
		}
		if (flag == false) {
			System.out.println("Data not selected");
		}
		con.close();
	}
}

