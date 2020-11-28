package com.sk.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class StorageProcedureDemo1 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stu
		Connection con = DriverManager.getConnection(DBInfo.Url(), DBInfo.User(), DBInfo.pwd());
		CallableStatement cs = con.prepareCall("{call addProc(?,?,?)}");
		cs.setInt(1, 100);
		cs.setInt(2, 200);
		cs.registerOutParameter(3, Types.INTEGER);
		cs.execute();
		System.out.println("Result " + cs.getInt(3));
		con.close();
	}
}
