package com.sk.jdbc;

import java.io.FileWriter;
import java.io.Writer;
import java.sql.SQLException;

import oracle.jdbc.rowset.OracleWebRowSet;

public class WebRowSetTest {

	public static void main(String[] args) {
		try (OracleWebRowSet wrowset = new OracleWebRowSet()) {
			// set jdbc propeties
			wrowset.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
			wrowset.setUsername("system");
			wrowset.setPassword("manager");
			// set SQL Query
			wrowset.setCommand("SELECT * FROM EMP12");
			// wrowset.setMaxRows(4);
			// execut the SQL query
			wrowset.execute();
			// process the RowSet
			wrowset.setReadOnly(false);
			while (wrowset.next()) {
				System.out.println(wrowset.getInt(1) + "  " + wrowset.getString(2) + "  " + wrowset.getFloat(3) + "  "
						+ wrowset.getString(4));
			}
			System.out.println("Wrting  RowSet object data to  Xml file");
			// write to xml file
			Writer writer = new FileWriter("student_info.xml");
			wrowset.writeXml(writer);
			System.out.println("Wrting  RowSet object data on the console  in xml format");
			wrowset.writeXml(System.out);
		} // try
		catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}// main
}// class
