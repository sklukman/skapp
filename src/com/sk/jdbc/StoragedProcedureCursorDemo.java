package com.sk.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import com.mysql.jdbc.CallableStatement;

import oracle.jdbc.OracleTypes;

public class StoragedProcedureCursorDemo {

	public static void main(String[] args) throws SQLException {

		Connection con = DriverManager.getConnection(DBInfo.Url(), DBInfo.User(), DBInfo.pwd());
		java.sql.CallableStatement cs = con.prepareCall("{call getAllInfo2(?,?)}");
		cs.setFloat(1, 7500);
		cs.registerOutParameter(2, OracleTypes.CURSOR);
		cs.execute();
		ResultSet rs = (ResultSet) cs.getObject(2);
		Boolean flag = false;
		System.out.println("ENO\tENAME\tESAL\tEADDR");
		while (rs.next()) {
			flag = true;
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getDouble(3) + "\t" + rs.getString(4));

		}
		if (flag == false) {
			System.out.println("No Record Available");
		}
		con.close();
	}

}
