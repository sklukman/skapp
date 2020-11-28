package com.sk.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class DateRetrive {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(Driver.driver());
		Connection con = DriverManager.getConnection(DBInfo.Url(), DBInfo.User(), DBInfo.pwd());
		PreparedStatement ps = con.prepareStatement("select * from userid");
		ResultSet rs = ps.executeQuery();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yyy");
		while (rs.next()) {
			String name = rs.getString(1);
			java.sql.Date date = rs.getDate(2);

			String s = sdf.format(date);
			System.out.println(name + "-------" + s);
		}
		con.close();
	}

}
