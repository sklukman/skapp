package com.sk.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class Function {

	public static void main(String[] args) throws SQLException {

		Connection con = DriverManager.getConnection(DBInfo.Url(), DBInfo.User(), DBInfo.pwd());
		CallableStatement cst = con.prepareCall("{?=call getAvg1(?,?)}");
		cst.setInt(2, 7698);
		cst.setInt(3, 7788);
		cst.registerOutParameter(1, Types.FLOAT);
		cst.execute();
		System.out.println("Salary..." + cst.getFloat(1));
		con.close();
	}

}
