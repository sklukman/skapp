package com.sk.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.OracleTypes;

public class Function1 {

	public static void main(String[] args) throws SQLException {

		Connection con = DriverManager.getConnection(DBInfo.Url(), DBInfo.User(), DBInfo.pwd());
		CallableStatement cs = con.prepareCall("{?=call getAllEmpD(?,?)}");
		cs.setInt(2, 2);
		cs.setInt(3, 4);
		cs.registerOutParameter(1, OracleTypes.CURSOR);
		cs.execute();
		ResultSet rs = (ResultSet) cs.getObject(1);
		Boolean flag = false;
		System.out.println("ENO\tENAME\tESAL\tEADDR");
		while (rs.next()) {
			flag = true;
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getDouble(3) + "\t" + rs.getString(4));
		}
		if (flag == false) {
			System.out.println("Record is not available");
		}
		con.close();
	}

}
