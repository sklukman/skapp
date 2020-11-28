package com.sk.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.OracleTypes;

public class StorageProcedure3 {
	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection(DBInfo.Url(), DBInfo.User(), DBInfo.pwd());
//		CallableStatement cs = con.prepareCall("{call getEmpInfo(?,?,?)");
//		cs.setInt(1, 7788);
//		cs.registerOutParameter(2, Types.VARCHAR);
//		cs.registerOutParameter(3, Types.DOUBLE);
//		cs.execute();
//		System.out.println("Employee Name::" + cs.getString(2));
//		System.out.println("Employee Sal::" + cs.getDouble(3));
//		con.close();
//	}
		CallableStatement cst = con.prepareCall("{call getAllInfo1(?)}");
		cst.registerOutParameter(1, OracleTypes.CURSOR);
		cst.execute();
		ResultSet rs = (ResultSet) cst.getObject(1);
		System.out.println("ENO\tENAME\tESAL\tEAADR");
		System.out.println("________________________");
		boolean flag = false;
		while (rs.next()) {
			flag = true;
			System.out.println(rs.getInt(1) + ".." + rs.getString(2) + ".." + rs.getDouble(3) + ".." + rs.getString(4));
		}
		if (flag == false) {
			System.out.println("No Record Found");
		}
		con.close();
	}
}
