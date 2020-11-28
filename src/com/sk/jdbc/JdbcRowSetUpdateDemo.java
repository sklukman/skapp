package com.sk.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class JdbcRowSetUpdateDemo {
	public static void main(String[] args) throws Exception {

		RowSetFactory rsf = RowSetProvider.newFactory();
		JdbcRowSet rs = rsf.createJdbcRowSet();
		rs.setUrl(DBInfo.Url());
		rs.setUsername(DBInfo.User());
		rs.setPassword(DBInfo.pwd());
		rs.setCommand("select * from emp12");
		rs.execute();
		while (rs.next()) {
			float esal = rs.getFloat(3);
			if (esal < 8000) {
				float new_Esal = esal + 777;
				rs.updateFloat(3, new_Esal);
				rs.updateRow();
			}
		}
		System.out.println("Records Updated Successfully");
		rs.close();
	}
}