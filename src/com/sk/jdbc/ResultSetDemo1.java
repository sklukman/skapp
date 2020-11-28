package com.sk.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetDemo1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// String Driver = "oracle.jdbc.OracleDriver";
	//	Class.forName(Driver.driver());
		Connection con = DriverManager.getConnection(DBInfo.Url(), DBInfo.User(), DBInfo.pwd());
		Statement st = con.createStatement(1004,1007);
		ResultSet rs = st.executeQuery("select * from emp11");
		System.out.println("farwar direction");
		System.out.println("ENO\tENAME\tESAL\tEADDR");
		while (rs.next()) {
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getDouble(3) + "\t" + rs.getString(4));
		}
		con.close();

	}

}
