package com.sk.jdbc;

import java.sql.SQLException;
import java.util.Scanner;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class RowSetJdbcRowSetDemo1 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Scanner scn = new Scanner(System.in);
		Class.forName(Driver.driver());
		RowSetFactory rsf = RowSetProvider.newFactory();
		JdbcRowSet rs = rsf.createJdbcRowSet();
		rs.setUrl(DBInfo.Url());
		rs.setUsername(DBInfo.User());
		rs.setPassword(DBInfo.pwd());
		rs.setCommand("select * from emp12");
		rs.execute();
		// no name sal add
		System.out.println("farward direction");
		System.out.println("Eno\tEname\tEsal\tEAddr");
		while (rs.next()) {
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getDouble(3) + "\t" + rs.getString(4));
		}

		System.out.println("backward direction");
		while (rs.previous()) {
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getDouble(3) + "\t" + rs.getString(4));
		}

		System.out.println("accessing randomly");
		rs.absolute(2);

		System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getDouble(3) + "\t" + rs.getString(4));

	}

}
