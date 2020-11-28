package com.sk.jdbc;

import java.sql.SQLException;

import oracle.jdbc.rowset.OracleCachedRowSet;

public class CachedRowSetTest {

	public static void main(String[] args) {
	   try(OracleCachedRowSet crowset=new OracleCachedRowSet()) {
		   //set jdbc propeties  
		   crowset.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		     crowset.setUsername("system");
		     crowset.setPassword("manager");
		    //set SQL Query
		     crowset.setCommand("SELECT * FROM EMP12");
		    // crowset.setMaxRows(4);
		     //execut the SQL query
		     crowset.execute();
		     //process the RowSet
		     crowset.setReadOnly(false);
		     while(crowset.next()) {
				 System.out.println(crowset.getInt(1)+"  "+crowset.getString(2)+"  "+crowset.getDouble(3)+"  "+crowset.getString(4));
		     }	   }//try
	   catch(SQLException se) {
		   se.printStackTrace();
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }

	}//main
}//class
