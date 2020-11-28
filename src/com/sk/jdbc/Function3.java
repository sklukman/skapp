package com.sk.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.OracleTypes;

public class Function3 {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection(DBInfo.Url(), DBInfo.User(), DBInfo.pwd());
		CallableStatement cs = con.prepareCall("{?=call getDeletedEmpInfo(?,?)}");
		cs.setInt(2, 4);
		cs.registerOutParameter(1, OracleTypes.CURSOR);
		cs.registerOutParameter(3, java.sql.Types.INTEGER);
		cs.execute();
		ResultSet rs = (ResultSet) cs.getObject(1);
		System.out.println("ENO\tENAME\tESAL\tEADDR");
		while (rs.next()) {
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "" + rs.getDouble(3) + "\t" + rs.getString(4));
		}
		int count = cs.getInt(3);
		System.out.println("Count::" + count);
	}
}
