package com.sk.jdbc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CLOBDemo1 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException, FileNotFoundException {

		Class.forName(Driver.driver());
		Connection con = DriverManager.getConnection(DBInfo.Url(), DBInfo.User(), DBInfo.pwd());
		File f = new File("E:\\hyd.txt");
		FileReader fr = new FileReader(f);
		PreparedStatement ps = con.prepareStatement("insert into cityinfo values(?,?)");
		ps.setString(1, "hyd");
		ps.setCharacterStream(2, fr);
		int rc = ps.executeUpdate();
		if (rc == 0) {
			System.out.println("record not inserted");
		} else {
			System.out.println("record inserted");
		}
	}

}
