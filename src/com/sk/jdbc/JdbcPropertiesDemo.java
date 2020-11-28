package com.sk.jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcPropertiesDemo {

	public static void main(String[] args) throws IOException, SQLException {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("E:\\db.properties");
		p.load(fis);
		String url = p.getProperty("url");
		String user = p.getProperty("user");
		String pwd = p.getProperty("pwd");
		Connection con = DriverManager.getConnection(url, user, pwd);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from emp11");

		boolean flag = false;
		System.out.println("Eno\tEName\tESal\t\tEAddr");
		while (rs.next()) {
			flag = true;
			System.out
					.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getDouble(3) + "\t\t" + rs.getString(4));
		}
		if (flag == false) {
			System.out.println("Data not selected");
		}
	}

}
