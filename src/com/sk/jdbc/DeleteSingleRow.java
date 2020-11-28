package com.sk.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteSingleRow {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String driver="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String pwd="manager";
		String query="delete from employee123 where ename='arbaj'";
		Class.forName(driver);
		Connection con=DriverManager.getConnection(url,user,pwd);
		Statement st=con.createStatement();
		int r=st.executeUpdate(query);
		System.out.println("The no. of row deleted"+r);
		con.close();
	}

}
