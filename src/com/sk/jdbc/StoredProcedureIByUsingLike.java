package com.sk.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.jdbc.OracleTypes;

public class StoredProcedureIByUsingLike {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = DriverManager.getConnection(DBInfo.Url(), DBInfo.User(), DBInfo.pwd());
		CallableStatement cs = con.prepareCall("{call getAllInfo4(?,?)}");
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Initial Char");
		String initChar = scn.next() + "%";
		cs.setString(1, initChar);
		cs.registerOutParameter(2, OracleTypes.CURSOR);
		System.out.println("Before result set");
		cs.execute();
		ResultSet rs = (ResultSet) cs.getObject(2);
		System.out.println("after result set");
		System.out.println("ENO\tENAME\tESAL\tEADDR");
		Boolean flag = false;
		while (rs.next()) {
			flag = true;
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getFloat(3) + "\t" + rs.getString(4));
		}
		if (flag == false) {
			System.out.println("data not available");
		}
		con.close();
	}

}
