package com.sk.jdbc;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectAllRowoHtmlDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		String query = "select * from employee123";
		Class.forName(Driver.driver());
		Connection con = DriverManager.getConnection(DBInfo.Url(), DBInfo.User(), DBInfo.pwd());

		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		String data = "";
		data = data + "<html><body><center><table border ='1' bgcolor='green'>";
		data = data + "<tr><td>ENO</td><td>ENAME</td><td>EADDR</td><td>ESAL</td></tr>"; 
		while (rs.next()) {
			data = data + "<tr><td>" + rs.getInt(1) + "</td><td>" + rs.getString(2) + "</td><td>" + rs.getString(3)
					+ "</td><td>" + rs.getDouble(4) + "</td></tr>";
		}
		data = data + "</table></center></body></html>";
		FileOutputStream fos = new FileOutputStream("E:\\emp.html");
		byte[] b = data.getBytes();
		fos.write(b);
		fos.flush();
		System.out.println("Open emp.html to get employee data");
		fos.close();
		con.close();
	}

}
