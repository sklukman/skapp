package com.sk.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource;


public class SqlDataSourceConnectionPool {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/sksoft";
		String user = "root";
		String pwd = "root";
		MysqlConnectionPoolDataSource ds= new MysqlConnectionPoolDataSource();
		ds.setUrl(url);
		ds.setUser(user);
		ds.setPassword(pwd);
		String query = "select * from skemp";
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
