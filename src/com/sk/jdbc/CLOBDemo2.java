package com.sk.jdbc;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sun.corba.se.spi.presentation.rmi.PresentationManager;

public class CLOBDemo2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Class.forName(Driver.driver());
		Connection con = DriverManager.getConnection(DBInfo.Url(), DBInfo.User(), DBInfo.pwd());
		FileWriter fw = new FileWriter("E:\\hyd.txt");
		PreparedStatement ps = con.prepareStatement("select * from cityinfo");
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			rs.getString(1);
			Reader r = rs.getCharacterStream(2);
			char[] buffer = new char[1024];

			while (r.read(buffer) > 0) {

				fw.write(buffer);
			}
			fw.flush();
			System.out.println("retrive successfully");
			con.close();

		}
	}

}
