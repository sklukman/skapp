package com.sk.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.sun.xml.internal.ws.org.objectweb.asm.Type;

public class StoredProcedureDemo2 {

	public static void main(String[] args) {
		Connection con = null;
		CallableStatement cs = null;
		try {
			con = DriverManager.getConnection(DBInfo.Url(), DBInfo.User(), DBInfo.pwd());
			cs = con.prepareCall("{call getSal(?,?)}");
			cs.setInt(1, 7839);
			cs.registerOutParameter(2, Type.FLOAT);
			cs.execute();
			System.out.println("salary is " + cs.getFloat(2));
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
