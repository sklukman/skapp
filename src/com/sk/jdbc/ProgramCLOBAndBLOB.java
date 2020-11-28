package com.sk.jdbc;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ProgramCLOBAndBLOB {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, ParseException, IOException {
		Class.forName(Driver.driver());
		Connection con = DriverManager.getConnection(DBInfo.Url(), DBInfo.User(), DBInfo.pwd());
		/*
		 * Its data for insert operation Scanner scn = new Scanner(System.in);
		 * System.out.println("Enter a Name"); String name = scn.next();
		 * System.out.println("Enter a date(dd-MM-yyyy)"); String dob = scn.next();
		 * 
		 * // create sdf obj to get date SimpleDateFormat sdf = new
		 * SimpleDateFormat("dd-MM-yyyy");
		 * 
		 * Its data for insert operation java.util.Date d = sdf.parse(dob); long i =
		 * d.getTime(); java.sql.Date sdate = new java.sql.Date(i); // create fis obj to
		 * get image FileOutputStream fos = new FileOutputStream("E:\\katrina.jpg"); //
		 * create fw obj to get text file FileWriter fw = new FileWriter("E:\\hyd.txt");
		 * // create ps object to represent query
		 * 
		 * Its data for insert operation PreparedStatement ps =
		 * con.prepareStatement("insert into jobseeker1 values(?,?,?,?)");
		 * ps.setString(1, name); ps.setDate(2, sdate); ps.setBinaryStream(3, fis);
		 * ps.setCharacterStream(4, fr); int r = ps.executeUpdate(); if (r == 1) {
		 * System.out.println("Record inserted"); } else
		 * System.out.println("Record not inserted");
		 * 
		 * PreparedStatement ps = con.prepareStatement("select * from jobseeker1");
		 * ResultSet rs = ps.executeQuery(); System.out.println(rs);
		 * 
		 * if (rs.next()) { // reading name String name = rs.getString(1);
		 * System.out.println(name); // reading date java.sql.Date sdate =
		 * rs.getDate(2); String dob = sdf.format(sdate); System.out.println(dob);
		 * 
		 * // reading blob object(image)
		 * 
		 * InputStream is = rs.getBinaryStream(3); System.out.println(is); byte[] buffer
		 * = new byte[2048]; while (is.read(buffer) > 0) { fos.write(buffer); }
		 * System.out.println(buffer); fos.flush(); // Reading clob ojb(text file);
		 * Reader r = rs.getCharacterStream(4); char[] ch = new char[1024]; while
		 * (r.read(ch) > 0) { fw.write(ch); } fw.flush(); }
		 */ con.close();
	}
}
