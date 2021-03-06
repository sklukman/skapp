package com.sk.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectParticularColumn {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String query = "select ename,esal from employee123";
		Class.forName(Driver.driver());
		Connection con = DriverManager.getConnection(DBInfo.Url(), DBInfo.User(), DBInfo.pwd());
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		boolean flag = false;
		System.out.println("Ename\tEsal");
		while (rs.next()) {
			flag = true;
			System.out.println(rs.getString(1) +"\t"+ rs.getDouble(2));
		}
		if (flag == false) {
			System.out.println("Table not selected");
		}
		con.close();
	}

}
