package com.sk.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectAllRowShortDemo {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String query = "select * from employee123 order by esal desc";
		Class.forName(Driver.driver());
		Connection con = DriverManager.getConnection(DBInfo.Url(), DBInfo.User(), DBInfo.pwd());
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		boolean flag = false;
		System.out.println("Eno\tEName\tESal\t\tEAddr");
		while (rs.next()) {
			flag = true;
			System.out
					.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t\t" + rs.getDouble(4));
		}
		if (flag == false) {
			System.out.println("Data not selected");
		}
		con.close();
	}
}
