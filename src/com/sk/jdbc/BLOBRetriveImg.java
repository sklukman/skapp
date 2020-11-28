package com.sk.jdbc;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import sun.misc.OSEnvironment;

public class BLOBRetriveImg {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Class.forName(Driver.driver());
		Connection con = DriverManager.getConnection(DBInfo.Url(), DBInfo.User(), DBInfo.pwd());
		Statement st = con.createStatement();
		PreparedStatement ps = con.prepareStatement("select * from personinfo");
		ResultSet rs = ps.executeQuery();
		FileOutputStream fos = new FileOutputStream("E:\\katrina.jpg");
		if (rs.next()) {
			String name = rs.getString(1);
			InputStream is = rs.getBinaryStream(2);
			byte[] buffer = new byte[2428];
			while (is.read(buffer) > 0) {
				fos.flush();
				System.out.println("image is available");
			}
			con.close();
		}
	}

}
