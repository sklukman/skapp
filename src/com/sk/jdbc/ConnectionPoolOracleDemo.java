package com.sk.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.pool.OracleConnectionPoolDataSource;
import oracle.jdbc.pool.OracleDataSource;

public class ConnectionPoolOracleDemo {

	public static void main(String[] args) throws SQLException {
		// Ocpd

		OracleConnectionPoolDataSource ds = new OracleConnectionPoolDataSource();
		ds.setURL(DBInfo.Url());
		ds.setUser(DBInfo.User());
		ds.setPassword(DBInfo.pwd());
		String query = "select * from emp11";
		Connection con = ds.getConnection();
		Statement st = con.createStatement();
		ResultSet rss = st.executeQuery(query);
		System.out.println("sno\tsname\tsal\taddr");
		// no name sal addr1
		while (rss.next()) {
			System.out.println(
					rss.getInt(1) + "\t" + rss.getString(2) + "\t" + rss.getDouble(3) + "\t" + rss.getString(4));
		}
		con.close();
	}

}
