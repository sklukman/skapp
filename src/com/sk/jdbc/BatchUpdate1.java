package com.sk.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchUpdate1 {
//no name sal add
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName(Driver.driver());
		Connection con=DriverManager.getConnection(DBInfo.Url(),DBInfo.User(),DBInfo.pwd());
		Statement st=con.createStatement();
		st.addBatch("insert into emp11 values(1,'Lukman',5000,'hyd')");
		st.addBatch("insert into emp11 values(2,'Rahul',6000,'nashik')");
		st.addBatch("insert into emp11 values(4,'Ravi',8000,'Aug')");
		int [] a=st.executeBatch();
		int s=0;
		for(int y:a)
		{
			System.out.println(y);
			s+=y;
			
		}
System.out.println("Batch updated::"+s);
	}

}
