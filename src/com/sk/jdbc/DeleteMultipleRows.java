package com.sk.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteMultipleRows {  

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String pwd = "manager";
        Class.forName(driver);
		Connection con = DriverManager.getConnection(url, user, pwd);
		Statement st = con.createStatement();
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter cutOff sal");
		double cutSal = scn.nextDouble();
		String query = String.format("delete from employee123 where esal>%f", cutSal);
		int d = st.executeUpdate(query);
		System.out.println("query deleted" + d);
		con.close();
	}

}
