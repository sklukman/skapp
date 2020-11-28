package com.sk.jdbc;

import java.awt.image.DataBufferUShort;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementDemo1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(Driver.driver());
		String query = "delete from employee123 where ename=?";
		Connection con = DriverManager.getConnection(DBInfo.Url(), DBInfo.User(), DBInfo.pwd());
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, "shaikh");
		int updateCount = ps.executeUpdate();
		System.out.println("one rows deleted:"+updateCount);
		System.out.println("Reusing preparedStatement to delete one more record...");
		ps.setString(1, "wasim");
		int updateCount1 = ps.executeUpdate();
		System.out.println("the no of rows deleted: " + updateCount1);
		con.close();
	}
}
