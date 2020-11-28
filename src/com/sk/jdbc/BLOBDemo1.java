package com.sk.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class BLOBDemo1 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException, FileNotFoundException {

		Class.forName(Driver.driver());
		Connection con = DriverManager.getConnection(DBInfo.Url(), DBInfo.User(), DBInfo.pwd());
		Statement st = con.createStatement();
		// create file object to represent image file
		File f = new File("E:\\katrina.jpg");
		// create fis object to read binary data from file
		FileInputStream fis = new FileInputStream(f);
		String query = "insert into personinfo values(?,?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, "katrina");
		ps.setBinaryStream(2, fis);
		int rs = ps.executeUpdate();
		if (rs == 0) {
			System.out.println("Record not inserted"+f.getAbsolutePath());
		}

		else
			System.out.println("Record inserted");
	}

}
