package com.sk.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchUpdate2 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName(Driver.driver());
		Connection con = DriverManager.getConnection(DBInfo.Url(), DBInfo.User(), DBInfo.pwd());
		Statement st = con.createStatement();
		st.addBatch("delete from emp11 where ename=5000");
		st.addBatch("update emp11 set esal=9000 where ename='virat'");
		st.addBatch("insert into emp11 values(1,'sk',7000,'sec')");
		int[] R = st.executeBatch();
		int i = 0;
		for (i = 0; i < R.length; i++) {

			i += i;
		}
		System.out.println("Batch executed::" + i);
		con.close();
	}

}
