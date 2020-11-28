package com.sk.jdbc;

import java.util.ArrayList;

public class DBInfo {
	public static String Url() {
		return "jdbc:oracle:thin:@localhost:1521:xe";
	}
	public static String User() {
		return "system";
	}
	public static String pwd() {
		return "manager";
	}
}
